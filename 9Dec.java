public class 9Dec {
    static long numOfWays(int N, int M)
    {
        // add your code here
        int mod=1000000000+7;
        int ans=0;
        int tp=N*M;
        for(int i=1;i<=N;i++){
            for(int j=1;j<=M;j++){
                ans+=((tp-1)-required(i,j,N,M));
                ans=ans%mod;
            }
        }
        return (long) ans;
    }
    public static int required(int i,int j,int n,int m) {
        int ans=0;
        if(i-1>0) {
            if(j-2>0) {
                ans++;
            }
            if(j+2<=m) {
                ans++;
            }
        }
        if(i-2>0) {
            if(j-1>0) {
                ans++;
            }
            if(j+1<=m) {
                ans++;
            }
        }
        if(i+1<=n) {
            if(j-2>0) {
                ans++;
            }
            if(j+2<=m) {
                ans++;
            }
        }
        if(i+2<=n) {
            if(j-1>0) {
                ans++;
            }
            if(j+1<=m) {
                ans++;
            }
        }
        return ans;
    }
}
