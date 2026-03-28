class Solution {
    public void moveZeroes(int[] nums) {
        int len=nums.length;
        int i=0;
        for(int num:nums){
            if(num!=0){
                nums[i]=num;
                i++;
            }
        }
        while(i<len){
            nums[i]=0;
            i++;
        }
    }
}
