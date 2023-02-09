public class 09Fb {
    public int maximumMatch(int[][] g)
    {
        // Code here
        int m=g.length;
        int n=g[0].length;
        int[] match=new int[n];
        Arrays.fill(match,-1);
        int res=0;
        for(int i=0;i<m;i++){
            boolean[] vis=new boolean[n];
            if(bfs(i,g,match,vis)) res++;
        }
        return res;
    }
    boolean bfs(int u,int[][] g,int[] match,boolean[] vis){
        for(int v=0;v<g[0].length;v++){
            if(g[u][v]==1 && !vis[v]){
                vis[v]=true;
                if(match[v]==-1 || bfs(match[v],g,match,vis)){
                    match[v]=u;
                    return true;
                }
            }
        }
        return false;
    }
    
}
