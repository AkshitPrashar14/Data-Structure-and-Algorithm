class Solution {
    public int minimumCost(int[] nums) {
        int number1=Integer.MAX_VALUE;
        int number2=Integer.MAX_VALUE;
        for(int i=1;i<nums.length;i++){
            if(nums[i]<number1){
                number2=number1;
                number1=nums[i];
            }else if(nums[i]<number2){
                number2=nums[i];
            }
        }
        return nums[0]+number1+number2;
    }
}
