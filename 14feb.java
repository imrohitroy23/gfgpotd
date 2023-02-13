public class 14feb {
    int minCost(int [][] c, int N){
        //Write your code here
        int p=0;
        int b=0;
        int y=0;
        for(int i=0;i<N;i++){
            int cp=c[i][0]+Math.min(b,y);
            int cb=c[i][1]+Math.min(p,y);
            int cy=c[i][2]+Math.min(p,b);
            p=cp;
            b=cb;
            y=cy;
        }
        return Math.min(p,Math.min(b,y));
        
    }
}
