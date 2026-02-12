class Solution {
    public int missingNumber(int[] nums) {
        // int sum1=0;
        // int sum2=0;
        // int n=nums.length;
        // for(int i=0;i<n;i++){
        //     sum1+=nums[i];
        // }
        // while(n>0){
        //     sum2+=n;
        //     n--;
        // }
        // int sum=sum2-sum1;
        // return sum;
        int n=nums.length;
        int xor=0;
        for(int i=0;i<n;i++){
            xor=xor^i;
            xor=xor^nums[i];
        }
        xor=xor^n;
        return xor;
    }
}
