class Solution {
    public int[] finalPrices(int[] prices) {
        // int n = prices.length;
        // int[] ans = new int[n];
        // Stack<Integer> st = new Stack<>();
        // for (int i = n - 1; i >= 0; i--) {
        //     while (!st.isEmpty() && st.peek() > prices[i]) {
        //         st.pop();
        //     }
        //     ans[i] = st.isEmpty() ? prices[i] : prices[i] - st.peek();
        //     st.push(prices[i]);
        // }
        // return ans;
        int n = prices.length;
        for (int i = 0; i < n; i++) {
            int discount = 0;

            for (int j = i + 1; j < n; j++) {
                if (prices[j] <= prices[i]) {
                    discount = prices[j];
                    break;
                }
            }
            prices[i] -= discount;
        }
        return prices;
    }
}
