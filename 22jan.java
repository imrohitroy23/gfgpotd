class 22jan{
    public static int solve(int n, int k, int[] arr) {
        // code here
        for(int i=1;i<n;i++){
            arr[i]+=arr[i-1];
        }
        ArrayList<Integer> factor=new ArrayList<>();
        for(int i=1;i*i<=arr[n-1];i++){
            if(arr[n-1]%i==0){
                factor.add(i);
                factor.add(arr[n-1]/i);
            }
        }
        int ans=1;
        for(int i:factor){
            int c=0;
            for(int a:arr){
                if(a%i==0) c++;
            }
            if(c>=k) ans=Math.max(ans,i);
        }
        return ans;
    }
}