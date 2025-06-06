class Solution:
    def generateParenthesis(self, n: int) -> List[str]:
        out = []
        
        def helper(br: str, left: int, right: int):
            if len(br) == 2*n:
                out.append(br)
            
            if left > 0:
                helper(br + '(', left-1, right)
            
            if right > 0 and right > left:
                helper(br + ')', left, right-1)
                
        helper("", n, n)
        
        return out