class Solution {
public:
    int fib(int n) {
        int last;
        int slast;
        if(n<=1)return n;
        last=fib(n-1);
        slast=fib(n-2);
        return last+slast;
    }
};
