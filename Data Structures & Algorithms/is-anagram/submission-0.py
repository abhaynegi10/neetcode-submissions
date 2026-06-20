class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        mp = {}
        for i in s:
            mp[i] = mp.get(i,0)+1
        for i in t:
            if i not in mp:
                return False
            mp[i] -= 1
        for i in mp:
            if mp[i] != 0:
                return False
        return True
            
       
       
    

