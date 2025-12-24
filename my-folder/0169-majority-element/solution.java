class Solution {
    public int majorityElement(int[] nums) {
        int a=nums[0];
        int count=1;
        for(int i=1;i<nums.length;i++){
            if(a==nums[i]){
                count++;
            }
            if(a!=nums[i]){
                count--;
                if(count<0){
                    a=nums[i];
                    count=(-count);
                }
            }
        }
        return a;
    }
}
