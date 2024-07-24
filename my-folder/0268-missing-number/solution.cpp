class Solution {
public:
    int missingNumber(vector<int>& nums) {
        int a=nums.size();
        int sum=(a*(a+1))/2;
        int sum1=0;
        for(int i=0;i<=a-1;i++){
            sum1=sum1+nums[i];
        }
        int missing=sum-sum1;
        return missing;
    }
};
