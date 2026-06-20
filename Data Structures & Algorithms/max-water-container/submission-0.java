class Solution {
    public int maxArea(int[] heights) {
        int maximumarea = 0;
        int i = 0;
        int j = heights.length - 1;
        while(i < j){
            int length = Math.min(heights[i],heights[j]);
            int breadth = j - i;
            int area = length*breadth;
            maximumarea = Math.max(area,maximumarea);
            if(heights[i] <= heights[j]){
                i++;
            }
            else{
                j--;
            }
        }
        return maximumarea;
    }
}
