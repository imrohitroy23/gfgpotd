public class 13jun {
    public int equalPairs(int[][] grid) {
        int n=grid.length;
        int c=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                boolean is=true;
                for(int ii=0;ii<n;ii++){
                    if(grid[i][ii]!=grid[ii][j]) {
                        is=false;
                        break;
                    }
                }
                if(is)c++;
            }
        }
        return c;
    }
}
