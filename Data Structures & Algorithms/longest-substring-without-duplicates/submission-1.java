class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> map = new HashSet<>();
        int count = 0;
        int maxcount = 0;
        int left = 0;
        for(int i = 0;i<s.length();i++){
           while(map.contains(s.charAt(i))){
            map.remove(s.charAt(left));
            left++;
            count--;
           }
           map.add(s.charAt(i));
           count++;
           maxcount = Math.max(maxcount,count);
        }
     return maxcount;   
    }
}
