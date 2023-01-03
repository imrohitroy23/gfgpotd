public class 4jan {
   
        public static int maximum_profit(int n, int[][] intervals) {
             int[] dp = new int[n];
         Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
         dp[0] = intervals[0][2];
         for (int i = 1; i < n; i++) {
           dp[i] = intervals[i][2];
           for (int j = i-1; j >= 0; j--) {
             if (intervals[j][1] <= intervals[i][0]) {
               dp[i] = Math.max(dp[i], dp[j] + intervals[i][2]);
             }
           }
         }
         int ans = 0;
         for (int x : dp) {
           ans = Math.max(ans, x);
         }
         return ans;
         
        }
    }
