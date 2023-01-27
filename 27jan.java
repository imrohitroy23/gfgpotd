public class 27jan {
    public int CountWays(String str)
    {
        // code here
        int mod=1000000007;
        int n=str.length();
        if(str.charAt(0)=='0') return 0;
        char ch[]=str.toCharArray();
        long dp[]=new long[n+1];
        dp[0]=1;
        dp[1]=1;
        for(int i=2;i<=n;i++){
            int oneword=ch[i-1]-'0';
            int twoword=10*(ch[i-2]-'0')+ch[i-1]-'0';
            if(oneword>=1 && oneword<=9){
                dp[i]=(dp[i]+dp[i-1])%mod;
            }
            if(twoword>=10 && twoword<=26){
                dp[i]=(dp[i]+dp[i-2])%mod;
            }
          
        }
        return (int)dp[n];
    }
}
