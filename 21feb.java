public class 21feb {
    
	public static int minIteration(int N, int M, int x, int y){
		//code here
		return (Math.max(x-1,N-x)+Math.max(y-1,M-y));
	}
}
