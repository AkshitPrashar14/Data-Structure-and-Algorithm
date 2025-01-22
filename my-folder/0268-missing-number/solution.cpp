class Solution {
public:
    int missingNumber(vector<int>& nums) {
        int n=nums.size();
        int b=n;
        int sum1=0;
        while(b>0){
            sum1+=b;
            b--;
        }
        int sum2=0;
        for(int i=0;i<n;i++){
            sum2+=nums[i];
            }
        return sum1-sum2;
        }
    };
