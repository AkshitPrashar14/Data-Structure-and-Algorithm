class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1 || numRows >= s.length())
            return s;

        int cycle = 2 * numRows - 2;
        char[] ans = new char[s.length()];
        int idx = 0;

        for (int row = 0; row < numRows; row++) {
            for (int j = row; j < s.length(); j += cycle) {

                ans[idx++] = s.charAt(j);

                int diagonal = j + cycle - 2 * row;
                if (row != 0 && row != numRows - 1 &&
                    diagonal < s.length()) {
                    ans[idx++] = s.charAt(diagonal);
                }
            }
        }

        return new String(ans);
    }
}
