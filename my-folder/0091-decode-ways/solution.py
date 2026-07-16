class Solution:
    def numDecodings(self, s: str) -> int:
        memo = {}

        def solve(i):
            if i == len(s):
                return 1

            if s[i] == '0':
                return 0

            if i in memo:
                return memo[i]

            ans = solve(i + 1)

            if i + 1 < len(s) and 10 <= int(s[i:i+2]) <= 26:
                ans += solve(i + 2)

            memo[i] = ans
            return ans

        return solve(0)
