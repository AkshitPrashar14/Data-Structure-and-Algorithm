class Solution {
    private Boolean[][] dp;

    private boolean solve(int[] nums, int index, int target) {
        if (target == 0)
            return true;

        if (index == nums.length || target < 0)
            return false;

        if (dp[index][target] != null)
            return dp[index][target];

        boolean take = solve(nums, index + 1, target - nums[index]);
        boolean skip = solve(nums, index + 1, target);

        return dp[index][target] = take || skip;
    }

    public boolean canPartition(int[] nums) {
        int sum = 0;
        for (int num : nums)
            sum += num;

        if (sum % 2 != 0)
            return false;

        int target = sum / 2;
        dp = new Boolean[nums.length][target + 1];

        return solve(nums, 0, target);
    }
}
