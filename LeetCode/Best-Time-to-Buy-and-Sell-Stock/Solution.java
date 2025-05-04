class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int miniPrice = prices[0];
        for(int i = 1; i< prices.length; i++) {
            int profit = prices[i]-miniPrice;
            maxProfit=Math.max(profit,maxProfit);
            miniPrice = Math.min(miniPrice, prices[i]);
        }
        return maxProfit;
    }
}