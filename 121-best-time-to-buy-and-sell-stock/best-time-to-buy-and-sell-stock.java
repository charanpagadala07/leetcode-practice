class Solution {
    public int maxProfit(int[] prices) {
        int bp = prices[0];
        int profit = 0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<bp){
                bp = prices[i];
            }
            else {
                int current_profit = prices[i] - bp;
                profit = Math.max(current_profit, profit);
            }
        }
        return profit;
    }
}