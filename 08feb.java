public class 08feb {
    long[] countZero(int n, int k, int[][] arr){
        // code here
        long[] ans=new long[k];
        HashSet<Integer> hr = new HashSet<>();
        HashSet<Integer> hc = new HashSet<>();
        for(int i=0;i<k;i++){
            hr.add(arr[i][0]-1);
            hc.add(arr[i][1]-1);
            ans[i]=n*n-(hr.size()*n+hc.size()*(n-hr.size()));
        }
        return ans;
        
    }
}
