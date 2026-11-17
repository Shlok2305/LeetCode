class Solution {
    public int minimumChanges(String s, int k) {
        int n = s.length();
        int[][] cost = new int[n][n];
        
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int len = j - i + 1;
                int minChangesForSubstring = len;
                for (int d = 1; d < len; d++) {
                    if (len % d == 0) {
                        int changes = 0;
                        for (int g = 0; g < d; g++) {
                            int l = i + g;
                            int r = i + len - d + g;
                            while (l < r) {
                                if (s.charAt(l) != s.charAt(r)) {
                                    changes++;
                                }
                                l += d;
                                r -= d;
                            }
                        }
                        minChangesForSubstring = Math.min(minChangesForSubstring, changes);
                    }
                }
                cost[i][j] = minChangesForSubstring;
            }
        }
        
        int[][] dp = new int[n + 1][k + 1];
        for (int i = 0; i <= n; i++) {
            java.util.Arrays.fill(dp[i], 1000000);
        }
        dp[0][0] = 0;
        
        for (int j = 1; j <= k; j++) {
            for (int i = 1; i <= n; i++) {
                for (int p = (j - 1) * 2; p < i - 1; p++) {
                    dp[i][j] = Math.min(dp[i][j], dp[p][j - 1] + cost[p][i - 1]);
                }
            }
        }
        
        return dp[n][k];
    }
}