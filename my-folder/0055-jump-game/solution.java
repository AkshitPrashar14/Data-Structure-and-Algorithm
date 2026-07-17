class Solution {
    int[] dp;
    public boolean canJump(int[] nums) {
        dp = new int[nums.length];
        for (int i = 0; i < nums.length; i++)
            dp[i] = -1;
        return solve(0, nums);
    }
    private boolean solve(int index, int[] nums) {
        if (index >= nums.length - 1)
            return true;
        if (dp[index] != -1)
            return dp[index] == 1;
        for (int jump = 1; jump <= nums[index]; jump++) {
            if (solve(index + jump, nums)) {
                dp[index] = 1;
                return true;
            }
        }
        dp[index] = 0;
        return false;
    }
}
