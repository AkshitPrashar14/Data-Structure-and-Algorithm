class Solution {
    public int largestRectangleArea(int[] h) {
        int maxArea=0;
        Stack<Integer> st=new Stack<>();
        int n=h.length;
        if(n==1)return h[0];
        for(int i=0;i<=n;i++){
            int currHeight= (i==n)?0:h[i];
            while(!st.isEmpty() && currHeight<h[st.peek()]){
                int hi=h[st.peek()];
                st.pop();
                int right=i;
                int left=st.isEmpty()? -1:st.peek();
                int width=right-left-1;
                maxArea=Math.max(maxArea,hi*width);
            }
            st.push(i);
        }
        return maxArea;
    }
}

