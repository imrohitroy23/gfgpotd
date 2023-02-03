public class 03feb {
    static int [] endPoints(int [][]matrix, int R, int C){
        //code here
        int[] exit=new int[2];
        String lastD="r";
        int i=0;
        int j=0;
        while(i>=0 && i<R && j<C && j>=0){
            exit[0]=i;
            exit[1]=j;
            if(matrix[i][j]==1){
                matrix[i][j]=0;
                lastD=change(lastD);
            }
            int up[]=move(lastD,i,j);
            i=up[0];
            j=up[1];
        }
    return exit;
}

static String change(String dir){
    String s="";
    if(dir.equals("u")) s="r";
    else if(dir.equals("r")) s="d";
    else if(dir.equals("d")) s="l";
    else if(dir.equals("l")) s="u";
    return s;
}

static int[] move(String lastD,int i,int j){
    int[] nI=new int[2];
    if(lastD.equals("r")) j++;
    else if(lastD.equals("l")) j--;
    else if(lastD.equals("u")) i--;
    else if(lastD.equals("d")) i++;
    nI[0]=i;
    nI[1]=j;

    return nI;
    
}

}
