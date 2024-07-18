class Solution {
public:
    int reverse(int x) {
        int reversed_num = 0;
        bool is_negative = x < 0;
        
        // Handle negative number case
        if (is_negative) {
            // Handle the case of INT_MIN when abs(x) will overflow
            if (x == INT_MIN)
                return 0;
            x = -x;
        }
        
        // Reverse the digits
        while (x > 0) {
            // Extract the last digit
            int digit = x % 10;
            // Check for overflow before updating reversed_num
            if (reversed_num > (INT_MAX - digit) / 10)
                return 0;
            reversed_num = reversed_num * 10 + digit;
            x /= 10;
        }
        
        // Apply the sign back if the original number was negative
        if (is_negative)
            reversed_num = -reversed_num;
        
        return reversed_num;
    }
};
