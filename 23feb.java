public class 23feb {
    static int uniquePaths(int n, int m, int[][] grid) {
        // code here
        long M=1000000007;
        long[][] dp=new long[n][m];
        for(int i=0;i<m;i++){
            if(grid[0][i]==0) break;
            dp[0][i]=grid[0][i];
        }
        for(int i=0;i<n;i++){
            if(grid[i][0]==0) break;
            dp[i][0]=grid[i][0];
        }
        if(grid[0][0]==0 || grid[n-1][m-1]==0) return 0;
        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                if(grid[i][j]!=0){
                    dp[i][j]=dp[i-1][j]+dp[i][j-1];
                    dp[i][j]%=M;
                }
            }
        }
        return (int)dp[n-1][m-1];
    }   
}
