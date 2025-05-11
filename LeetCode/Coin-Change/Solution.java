class Solution {
    public int coinChange(int[] coins, int amount) {
        int[][] dp = new int[coins.length][amount + 1];
        for (int[] row : dp)
            Arrays.fill(row, -1);
        int result = memoizationUti(coins, amount, coins.length-1, dp);

        return result >= (int) 1e9 ? -1: result;
    }

    public int memoizationUti(int[] coins, int amount, int index, int[][] dp) {
        if(index == 0) {
            if(amount%coins[0] == 0) return amount/coins[0];
            else 
              return (int)1e9;
        }
        if(dp[index][amount] != -1) return dp[index][amount];
        int notTaken = memoizationUti(coins, amount, index-1,dp);
        int taken = (int)1e9;
        if (coins[index] <= amount)
            taken = 1 + memoizationUti(coins, amount - coins[index], index, dp);
        return dp[index][amount] = Math.min(taken, notTaken);
    }

    public int recursiveUtil(int[] coins, int amount, int index) {
        if(index == 0) {
            if(amount%coins[0] == 0) return amount/coins[0];
            else 
              return (int)1e9;
        }
        int notTaken = recursiveUtil(coins, amount, index-1);
        int taken = (int)1e9;
        if (coins[index] <= amount)
            taken = 1 + recursiveUtil(coins, amount - coins[index], index);
        return Math.min(taken, notTaken);
    }
}