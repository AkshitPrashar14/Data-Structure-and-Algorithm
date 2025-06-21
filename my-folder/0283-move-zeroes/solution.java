class Solution {
    public void moveZeroes(int[] nums) {
        int nonzero = 0;
        for (int num : nums) {
            if (num != 0) {
                nums[nonzero++] = num;
            }
        }
        while (nonzero < nums.length) {
            nums[nonzero++] = 0;
        }
    }
}
