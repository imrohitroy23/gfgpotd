public class 01feb {
    public static long distinctColoring(int N, int[]r, int[]g, int[]b){
        //code here
        long[][] dp=new long[N][3];
        for(long[] i:dp) Arrays.fill(i,-1);
        dp[0][0]=r[0];
        dp[0][1]=g[0];
        dp[0][2]=b[0];
        for(int i=01;i<N;i++){
            dp[i][0]=r[i]+Math.min(dp[i-1][1],dp[i-1][2]);
            dp[i][1]=g[i]+Math.min(dp[i-1][0],dp[i-1][2]);
            dp[i][2]=b[i]+Math.min(dp[i-1][0],dp[i-1][1]);
        }
        
        return Math.min(dp[N-1][0],Math.min(dp[N-1][1],dp[N-1][2]));
        
    }
}
