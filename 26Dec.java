public class 26Dec {
    

    
    void precompute(){
        // Code Here
    }
    long solve(long L, long R){
        long count = 0;
        long i = 1;
        while(i<R){
            long j = i<<1;
            while(j<R){
                long k = j<<1;
                while(k<R){
                    long num = i | j | k;
                    if(L <= num && num <= R)
                        count++;
                    k = k<<1;
                }
                j = j<<1;
            }
            i = i<<1;
        }
        return count;
    }
    

}
