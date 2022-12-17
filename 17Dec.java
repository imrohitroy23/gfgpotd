public class 17Dec {
        int waysToBreakNumber(int N){
            // code here
            long mod=1000000007;
            long count=0;
            count=((((N+1)%mod)*((N+2)%mod)/2)%mod);
            return (int) count;
        }
    
}
