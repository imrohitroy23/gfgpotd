public class 05june {
    public boolean checkStraightLine(int[][] c) {
        int n=c.length;
        int x1=c[0][0];
        int y1=c[0][1];
        int x2=c[1][0];
        int y2=c[1][1];
        
        for(int i=2;i<n;i++){
            int x=c[i][0];
            int y=c[i][1];
            if((y-y1)*(x-x2)!=(y-y2)*(x-x1)) return false;
            
        }
        return true;
    }

}
