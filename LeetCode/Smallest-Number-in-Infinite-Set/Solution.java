private List<Integer> sorted;
int smallest=1;
public SmallestInfiniteSet() {
    sorted=new ArrayList<Integer>();
}

public int popSmallest() {
    if(sorted.size()>0){
        return sorted.remove(0);
    }
    return smallest++;
}

public void addBack(int num) {
    if(num<smallest){
        if(sorted.size()==0 ){
            sorted.add( num);
            return;
        }
        int l=-1, r=sorted.size();
        while(l+1!=r){
            int m=l+(r-l)/2;
            if(sorted.get(m)==num){
                return;
            }
            else if(sorted.get(m)<num){
                l=m;
            }
            else{
                r=m;
            }
        }

        sorted.add(r, num);
    }

}