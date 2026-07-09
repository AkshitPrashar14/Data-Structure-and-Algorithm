class Solution {

    public int change(int amount, int[] coins) {
        int n = coins.length;
        int[][] dp = new int[n][amount + 1];
        for (int[] row : dp)
            Arrays.fill(row, -1);
        return solve(n - 1, dp, coins, amount);
    }
    int solve(int index, int[][] dp, int[] coins, int amount) {
        if (index == 0) {
            if (amount % coins[0] == 0)
                return 1;
            return 0;
        }
        if (dp[index][amount] != -1)
            return dp[index][amount];
        int notPick = solve(index - 1, dp, coins, amount);
        int pick = 0;
        if (coins[index] <= amount)
            pick = solve(index, dp, coins, amount - coins[index]);
        return dp[index][amount] = pick + notPick;
    }
}
