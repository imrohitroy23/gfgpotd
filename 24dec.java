public class 24dec {
        long wineSelling(int a[],int N){
            // code here
        long ans=0, sum=0;
        for(int i=0;i<N;i++)
        {
           ans+=Math.abs(sum);
           sum+=a[i];
        }
        return ans;
    }
    
}
