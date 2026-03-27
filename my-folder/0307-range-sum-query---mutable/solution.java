class NumArray {
    int[] tree;
    int n;

    public NumArray(int[] nums) {
        n = nums.length;
        tree = new int[4 * n];
        build(nums, 0, 0, n - 1);
    }

    private void build(int[] nums, int node, int start, int end) {
        if (start == end) {
            tree[node] = nums[start];
            return;
        }

        int mid = (start + end) / 2;
        build(nums, 2 * node + 1, start, mid);
        build(nums, 2 * node + 2, mid + 1, end);

        tree[node] = tree[2 * node + 1] + tree[2 * node + 2];
    }

    public void update(int index, int val) {
        updateHelper(0, 0, n - 1, index, val);
    }

    private void updateHelper(int node, int start, int end, int idx, int val) {
        if (start == end) {
            tree[node] = val;
            return;
        }

        int mid = (start + end) / 2;

        if (idx <= mid) {
            updateHelper(2 * node + 1, start, mid, idx, val);
        } else {
            updateHelper(2 * node + 2, mid + 1, end, idx, val);
        }

        tree[node] = tree[2 * node + 1] + tree[2 * node + 2];
    }

    public int sumRange(int left, int right) {
        return query(0, 0, n - 1, left, right);
    }

    private int query(int node, int start, int end, int left, int right) {
        if (right < start || left > end) return 0; // no overlap

        if (left <= start && end <= right) return tree[node]; // complete overlap

        int mid = (start + end) / 2;

        return query(2 * node + 1, start, mid, left, right) +
               query(2 * node + 2, mid + 1, end, left, right);
    }
}
