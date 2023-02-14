public class 15feb {
    int water_flow(int [][] mat, int N, int M) {
		//Write your code here
	    boolean[][] result1 = new boolean[N][M];
		boolean[][] result2 = new boolean[N][M];
		for(int r=0;r<N;r++){
		    dfs(r,0,result1,mat,N,M,Integer.MIN_VALUE);
		    dfs(r,M-1,result2,mat,N,M,Integer.MIN_VALUE);
		}
		
		for(int c=0;c<M;c++){
		    
		    dfs(0,c,result1,mat,N,M,Integer.MIN_VALUE);
		    dfs(N-1,c,result2,mat,N,M,Integer.MIN_VALUE);
		    
		}
		return count(result1,result2);
	}
	
	int count(boolean[][] result1,boolean[][] result2){
	    int c1=0;
	    for(int r=0;r<result1.length;r++){
	        for(int c=0;c<result2[r].length;c++){
	            if(result1[r][c] && result2[r][c]) c1++;
	        }
	    }
	    return c1;
	}
	void dfs(int r, int c,boolean[][] res,int[][] mat,int n,int m, int prev){
	    if(r<0 || r>=n ||c<0 ||c>=m || res[r][c]==true || mat[r][c]<prev) 
	    return;
	    res[r][c]=true;
	    dfs(r+1,c,res,mat,n,m,mat[r][c]);
	    dfs(r-1,c,res,mat,n,m,mat[r][c]);
	    dfs(r,c+1,res,mat,n,m,mat[r][c]);
	    dfs(r,c-1,res,mat,n,m,mat[r][c]);
	}
}
