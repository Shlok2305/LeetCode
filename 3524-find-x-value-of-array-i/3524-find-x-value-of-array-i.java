class Solution {

    public long[] resultArray(int[] nums, int k) {

        long[] dp = new long[k];
        long[] ans = new long[k];

        for (int num : nums) {

            long[] next = new long[k];

            int mod = num % k;

            next[mod]++;

            for (int r = 0; r < k; r++) {
                next[(r * mod) % k] += dp[r];
            }

            for (int r = 0; r < k; r++) {
                ans[r] += next[r];
            }

            dp = next;
        }

        return ans;
    }
}