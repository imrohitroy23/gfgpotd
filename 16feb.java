public class 16feb {
    static int dp[];
    public static int goodStones(int n, int[] arr) {
        // code here
        dp=new int[n];
        Arrays.fill(dp,-1);
        for(int i=0;i<n;i++){
            if(dp[i]==-1) dp[i]=helper(i,arr,n);
        }
        int c=0;
        for(int i=0;i<n;i++){
            if(dp[i]==1) c++;
        }
        return c;
        
    }
    public static int helper(int i, int arr[],int n){
        if(i<0 || i>=n) return 1;
        if(dp[i]!=-1) return dp[i];
        dp[i]=0;
        return dp[i]=helper(i+arr[i],arr,n);
    }
}
