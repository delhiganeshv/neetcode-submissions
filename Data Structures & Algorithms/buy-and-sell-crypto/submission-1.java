class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minBuy = prices[0];

        for(int price : prices) {
            maxProfit = Integer.max(maxProfit, price - minBuy);
            minBuy = Integer.min(minBuy, price);
           
        }

        return maxProfit;
        
    }
}
