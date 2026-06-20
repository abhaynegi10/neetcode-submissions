class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> map = new HashSet<>();
        for(int i = 0;i<nums.length;i++){
            map.add(nums[i]);
        }
        int longest = 0;
        for(int i = 0;i<nums.length;i++){
            int le;
            if(!map.contains(nums[i] - 1)){
             le  = 1;
            
            while(map.contains(nums[i] + le)){
                le++;
            }
            longest = Math.max(longest,le);
        }
        }
        return longest;
    }
}
