public class 19jan {
   
        int carpetBox(int A, int B, int C, int D) { 
            //code here
            int a=0;
            int b=0;
            int c=0;
            int d=0;
            
            while(A>C|| A>D){
                if(A>C) a++;
                if(A>D) b++;
                A/=2;
                
            }
             while(B>C|| B>D){
                if(B>C) c++;
                if(B>D) d++;
                B/=2;
                
            }
            return Math.min(a+d,b+c);
        }
       
}
