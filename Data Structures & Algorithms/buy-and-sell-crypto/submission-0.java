class Solution {
    public int maxProfit(int[] prices) {
     int buy = 0;
     int sell = 1;
     int maxp = 0;
     for(sell = 1;sell<prices.length;sell++){
        if(prices[sell]>prices[buy]){
            int profit = prices[sell] - prices[buy];
            maxp = Math.max(maxp,profit);
        }else{
            buy = sell;
        }
        
     }
     return maxp;
    }
}
