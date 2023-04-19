public class 19apr {
    boolean wifiRange(int N, String S, int X) 
    { 
       int z=0;
       for(int i=0;i<N;i++){
           if(S.charAt(i)=='1'){
               if(z-X>0) return false;
               else {
                   z=0;
                   z-=X;
               }
           }
           else z++;
       }
       if(z>0) return false;
       return true;
    }
}
