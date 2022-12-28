
class 27dec{


    long maxArea(int A[], int len){
        
int i=0, j=A.length-1;
       int ans=0;
       while(i!=j)
       {
           int temp= Math.min(A[i],A[j])*(j-i);
           ans= Math.max(temp,ans);
           if(A[i]>A[j])
                j--;
           else
                i++;
       }
       return ans;
    }
    
}
