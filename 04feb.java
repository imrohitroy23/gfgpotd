public class 04feb {
       // code here
       int findMaxSum(int arr[], int n) {
       int f=arr[0];
       int s=0;
       for(int i=1;i<n;i++){
           int k=s+arr[i];
           int ns=Math.max(f,s);
           f=k;
           s=ns;
       }
       return Math.max(s,f);
   }
}
