class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
            }
        }
        if(nums.length==threshold)return max;
        int low=1;
        int high=max;
        while(low<=high){
            int mid=(low+high)/2;
            if(rem(nums,mid,threshold)){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return low;
    }
    boolean rem(int[] nums,int mid,int threshold){
        int sum=0;
        for(int x:nums){
            sum+=(x+mid-1)/mid;
            if(sum>threshold)return false;
        }
        return true;
    }
}
