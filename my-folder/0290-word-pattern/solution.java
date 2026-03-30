class Solution {
    public boolean wordPattern(String pattern, String s) {
        String words[]=s.split(" ");
        if(pattern.length() !=words.length){
            return false;
        }
        Map<Character,String> cs=new HashMap<>();
        Map<String,Character> sc=new HashMap<>();
        for(int i=0;i<pattern.length();i++){
            char ch=pattern.charAt(i);
            String word=words[i];
            if(cs.containsKey(ch)){
                if(!cs.get(ch).equals(word)){
                    return false;
                }
            }else{
                cs.put(ch,word);   
            }
            if(sc.containsKey(word)){
                if(sc.get(word)!=ch){
                    return false;
                }
            }else{
                sc.put(word,ch);
            }
        }
        return true;
    }
}
