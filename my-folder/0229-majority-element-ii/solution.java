class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int c1 = 0, c2 = 0;
        Integer n1 = null, n2 = null;

        for (int x : nums) {
            if (n1 != null && x == n1) c1++;
            else if (n2 != null && x == n2) c2++;
            else if (c1 == 0) { n1 = x; c1 = 1; }
            else if (c2 == 0) { n2 = x; c2 = 1; }
            else { c1--; c2--; }
        }

        c1 = c2 = 0;
        for (int x : nums) {
            if (x == n1) c1++;
            else if (x == n2) c2++;
        }

        List<Integer> res = new ArrayList<>();
        if (c1 > nums.length / 3) res.add(n1);
        if (c2 > nums.length / 3) res.add(n2);
        return res;
    }
}
