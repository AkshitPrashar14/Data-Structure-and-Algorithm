class Solution {
public:
    int singleNumber(vector<int>& nums) {
        int xora = 0;
        int n=nums.size()-1;
        for(int i=0;i<=n;i++){
            xora=xora^nums[i];
        }
        return xora;
    }
};
