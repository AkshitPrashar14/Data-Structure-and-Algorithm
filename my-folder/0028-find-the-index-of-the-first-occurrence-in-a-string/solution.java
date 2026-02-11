class Solution {
    public int strStr(String haystack, String needle) {
        // for(int i=0;i<=haystack.length()-needle.length();i++){
        //     String j=haystack.substring(i,i+needle.length());
        //     if(needle.equals(j)){
        //         return i;
        //     }
        // }
        // return -1;

        char[] h= haystack.toCharArray();
        char[] n=needle.toCharArray();

        for(int i=0; i<=h.length - n.length;i++){
            int j=0;
            while(j<n.length && h[i+j]==n[j]){
                j++;
            }
            if(j==n.length){
                return i;
            }
            
        }
        return-1;
    }
}
