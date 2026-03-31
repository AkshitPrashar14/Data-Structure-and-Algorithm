class Solution {
    public boolean checkRecord(String s) {
        char[] ch=s.toCharArray();
        int cA=0;
        int cL=0;
        int isFail=0;
        for(int i=0;i<ch.length;i++){
            if(ch[i]=='A'){
                cA+=1;
                cL=0;
            }
            else if(ch[i]=='L'){
                cL+=1;
            }else{
                cL=0;
            }
            isFail=Math.max(isFail,cL);
        }
        if(cA>1 || isFail>=3){
            return false;
        }
        return true;
    }
}
