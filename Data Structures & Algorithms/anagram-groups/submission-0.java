class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       HashMap <String,List<String>> a = new HashMap<>();
       for(int i = 0;i< strs.length;i++){
        String s = strs[i];
        int [] count = new int[26];
        for(int j = 0;j<s.length();j++){
            char c = s.charAt(j);
            count[c - 'a']++;
        }
        StringBuilder sb = new StringBuilder();
        for(int k = 0; k<count.length;k++){
            sb.append('#');
            sb.append(count[k]);
        }
        String key = sb.toString();

        if(!a.containsKey(key)){
            a.put(key,new ArrayList<String>());
        }
        a.get(key).add(s);

       }
    return new ArrayList<>(a.values());
    }
}
