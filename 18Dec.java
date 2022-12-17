public class 18Dec {
    
    long maxGcd(int N) {
        // code here
        long res=1;
        int c=0;
        while(N>0){
            if(gcd(N,res)==1){
                res*=N;
                c++;
            }
            if(c==4) break;
            N--;
            
        }
        return res;
    }
    long gcd(long x,long y){
        return x==0?y:gcd(y%x,x);
    }
}
