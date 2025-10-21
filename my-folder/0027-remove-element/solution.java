class Solution {
    public int removeElement(int[] nums, int val) {
        int cnt=0;
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[j]=nums[i];
                cnt++;
                j++;
            }
        }
        return cnt;
    }
}
