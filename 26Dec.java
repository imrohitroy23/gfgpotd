public class 26Dec {
    

    
void precompute(){
        // Code Here
    }
    long solve(long L, long R){

        long ans=00;
    for(int i=0;i<63;i++){
        for(int j=i+1;j<63;j++){
            for(int k=j+1;k<63;k++){
                long c=0;
                c|=(1L<<i);
                c|=(1L<<j);
                c|=(1L<<k);
                if(c>=L && c<=R) ans++;
            }
        }
    }
    return ans;


}
