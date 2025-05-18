class Solution {
public:
    vector<vector<int>> kClosest(vector<vector<int>>& P, int k) {
        auto euclidean = [](auto& p) { return p[0] * p[0] + p[1] * p[1]; };
        auto comp = [&](auto& a, auto& b) { return euclidean(a) > euclidean(b); };
        make_heap(begin(P), end(P), comp);
        
        for(int i = 0; i < k; i++) 
            pop_heap(begin(P), end(P)-i, comp);

        return vector<vector<int>>(begin(P)+size(P)-k, end(P));
    }
};