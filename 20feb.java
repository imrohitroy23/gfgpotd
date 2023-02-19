public class 20feb {
    public static int countPaths(int N){
		//code here
		long M = 1000000007;
		if(N==1) return 0;
		long o=1,a=0,b=0,c=0;
		for(int i=1;i<=N;i++){
		    long co=(a+b+c)%M;
		    long ca=(o+b+c)%M;
		    long cb=(o+a+c)%M;
		    long cc=(o+a+b)%M;
		    
		    o=co;
		    a=ca;
		    b=cb;
		    c=cc;
		}
	return (int) o;	
	}
}
