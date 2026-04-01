class Solution {
    


    public int[] prisonAfterNDays(int[] cells, int n) {
        Map<String, Integer> seen = new HashMap<>();
        boolean cycleFound = false;
        int cycleLength = 0;

        while (n > 0) {
            String state = Arrays.toString(cells);

            if (!cycleFound) {
                if (seen.containsKey(state)) {
                    cycleFound = true;
                    cycleLength = seen.get(state) - n;
                    n %= cycleLength;
                } else {
                    seen.put(state, n);
                }
            }

            if (n > 0) {
                n--;
                cells = nextDay(cells);
            }
        }

        return cells;
    }

    private int[] nextDay(int[] cells) {
        int[] next = new int[8];

        for (int i = 1; i < 7; i++) {
            next[i] = (cells[i - 1] == cells[i + 1]) ? 1 : 0;
        }

        return next;
    }

}
