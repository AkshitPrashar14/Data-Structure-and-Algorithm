class Solution {
    public int maximumDifference(int[] nums) {
        if(nums.length<2){
            return 0;
        }
        int min=nums[0];
        int flag=0;
        int maxdiff=Integer.MIN_VALUE;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > min) {
                maxdiff = Math.max(maxdiff, nums[i] - min);
                flag++;
            } else {
                min = nums[i];
            }
        }
        if(flag==0)return -1;
        return maxdiff;
    }
}
