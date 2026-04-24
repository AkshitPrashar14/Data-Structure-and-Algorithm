class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int left=0;
        int right=0;
        int dftd=0;
        for(char c:moves.toCharArray()){
            if(c=='L'){
                left++;
            }else if(c=='R'){
                right++;
            }else{
                dftd++;
            }
        }
        int length=Math.abs(left-right);
        return dftd+length;
    }
}
