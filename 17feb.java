public class 17feb {
    static long solve(int n, int k, ArrayList<Long> GeekNum) {
        //code here
        
        
        if(n<=k) return GeekNum.get(n-1);
        Queue<Long> q=new LinkedList<>();
        long ans=0;
        for(long i:GeekNum) {
            q.add(i);
            ans+=i;
        }
        while(k<n-1){
            q.add(ans);
            ans+=ans;
            ans-=q.poll();
            k++;
        }
        return ans;
        
    }
}
