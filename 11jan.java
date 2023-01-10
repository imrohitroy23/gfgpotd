public class 11jan {
   

    public long minIncrements(int[] arr, int n) {
        // Code here
        long ans=0;
        Arrays.sort(arr);
        for(int i=1;i<n;i++){
            if(arr[i]<=arr[i-1]){
                int d=arr[i-1]-arr[i];
                ans+=d+1;
                arr[i]=arr[i-1]+1;
            }
        }
        return ans;
    }
}
