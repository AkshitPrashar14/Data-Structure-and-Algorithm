class Solution {
    public void reverseString(char[] s) {
        int n=s.length-1;
        int start=0;
        while(start<n){
            char temp=s[start];
            s[start]=s[n];
            s[n]=temp;
            start++;
            n--;
        }
    }
}
