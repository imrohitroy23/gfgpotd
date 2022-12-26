public class 27Dec {
   
    
        long maxArea(int A[], int len){
            int max=0,l=0,r=len-1;
            while(l<r){
                int val= Math.min(A[l],A[r])*(r-l);
                
                if(val>max){
                    max=val;
                }
                
                if(A[l]<A[r])
                    l++;
                else
                    r--;
            }
            return max;
            
        }
        
    
}
