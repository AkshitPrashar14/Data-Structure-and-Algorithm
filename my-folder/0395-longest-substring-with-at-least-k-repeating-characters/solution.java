public class Solution {
    public int longestSubstring(String s, int k) {
        return solve(s, 0, s.length(), k);
    }
    private int solve(String s, int start, int end, int k) {
        if (end - start < k) return 0;
        int[] counts = new int[26];
        for (int i = start; i < end; i++) {
            counts[s.charAt(i) - 'a']++;
        }
        for (int i = start; i < end; i++) {
            char c = s.charAt(i);
            if (counts[c - 'a'] < k) {
                int leftSub = solve(s, start, i, k);
                int rightSub = solve(s, i + 1, end, k);
                return Math.max(leftSub, rightSub);
            }
        }
        return end - start;
    }
}
