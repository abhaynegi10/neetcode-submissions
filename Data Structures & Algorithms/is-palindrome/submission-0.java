class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]","");
        s = s.toLowerCase();
        int a = 0;
        int b = s.length() - 1;
        for(int i =0;i<s.length()/2;i++){
        if(s.charAt(a) != s.charAt(b)){
            return false;
        }
        a++;
        b--;
        }
        return true;
    }
}
