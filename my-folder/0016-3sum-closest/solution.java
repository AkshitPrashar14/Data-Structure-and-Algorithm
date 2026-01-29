class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        if(nums.length<3){
            return -1;
        }
        int n=nums.length;
        int mindiff=Integer.MAX_VALUE;
        int cnt=0;
        for(int i=0;i<n-1;i++){
            int j=i+1;
            int k=n-1;
            int sum=0;
            while(j<k){
                sum=nums[i]+nums[j]+nums[k];
                if(Math.abs(target-sum)<mindiff)cnt=sum;
                mindiff=Math.min(mindiff,Math.abs(target-sum));
                if(sum<target){
                    j++;
                }else{
                    k--;
                }
            }
        }
        return cnt;
    }
}
