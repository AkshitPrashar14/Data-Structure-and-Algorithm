class Solution {
    public int minRemoval(int[] nums, int k) {
        Arrays.sort(nums);
        int low=0;
        int maxKeep=0;
        for(int i=0;i<nums.length;i++){
            while(low<i && nums[i]>(long)nums[low]*k){
                low++;
            }
            maxKeep=Math.max(maxKeep,i-low+1);
        }
        return nums.length-maxKeep;
    }
}
