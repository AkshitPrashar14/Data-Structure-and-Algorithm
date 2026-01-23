class Solution {
public:
    bool isNonDecreasing(const vector<long long>& nums) {
        for (int i = 1; i < nums.size(); i++) {
            if (nums[i] < nums[i - 1]) {
                return false;
            }
        }
        return true;
    }

    int minimumPairRemoval(vector<int>& nums) {
        vector<long long> arr(nums.begin(), nums.end());
        int op = 0;

        while (!isNonDecreasing(arr)) {
            long long minSum = LLONG_MAX;
            int idx = 0;

            for (int i = 0; i < arr.size() - 1; i++) {
                long long sum = arr[i] + arr[i + 1];
                if (sum < minSum) {
                    minSum = sum;
                    idx = i;
                }
            }

            arr[idx] = arr[idx] + arr[idx + 1];
            arr.erase(arr.begin() + idx + 1);

            op++;
        }

        return op;
    }
};
