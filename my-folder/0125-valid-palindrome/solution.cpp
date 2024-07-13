class Solution {
public:
    bool isPalindrome(string s) {
    int left = 0, right = s.length() - 1;
        
        while (left < right) {
            // Move left pointer until it points to an alphanumeric character
            while (left < right && !isalnum(s[left])) {
                left++;
            }
            // Move right pointer until it points to an alphanumeric character
            while (left < right && !isalnum(s[right])) {
                right--;
            }
            
            // Compare characters at left and right pointers after converting to lowercase
            if (tolower(s[left]) != tolower(s[right])) {
                return false;
            }
            
            // Move both pointers inward
            left++;
            right--;
        }
        
        return true;
    }
};
