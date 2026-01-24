class Solution {
    public int vowelConsonantScore(String s) {
        int v=0;
        int ch=0;
        
        for(char c:s.toCharArray()){
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
                v++;
            }
            else if(c=='0' || c=='1' || c=='2' || c=='3' || c=='4' || c=='5' || c=='6' || c=='7' || c=='8' || c=='9' || c==' '){}
            else{
                ch++;
            }
        }
        if(ch==0){
            return 0;
        }else{
            return v/ch;
        }
    }
}
