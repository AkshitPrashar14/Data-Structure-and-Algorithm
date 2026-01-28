class Solution {
    public int mySqrt(int x) {
        int l=0;
        int r=x;
        int sqrt=0;
        while(l<=r){
            int m=(r+l)/2;
            if((long)m*m<=x){
                sqrt=m;
                l=m+1;
            }else{
                r=m-1;
            }
        }
        return sqrt;
    }
}
