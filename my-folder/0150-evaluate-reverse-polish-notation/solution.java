class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st=new Stack<>();
        for(String t:tokens){
            if(t.equals("+") || t.equals("-") || t.equals("/") || t.equals("*")){
                int b=st.peek();
                st.pop();
                int a=st.peek();
                st.pop();
                if(t.equals("+"))st.push(a+b);
                if(t.equals("-"))st.push(a-b);
                if(t.equals("/"))st.push(a/b);
                if(t.equals("*"))st.push(a*b);
            }else{
                st.push(Integer.parseInt(t));
            }
        }
        return st.peek();
    }
}
