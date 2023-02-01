public class 02feb {
    public long largesSumCycle(int N, int edge[]){
        boolean[] vis=new boolean[N];
        long ans=-1;
        for(int i=0;i<N;i++){
            if(edge[i]==-1 ||vis[i] || vis[edge[i]]){
                continue;
            }
            int src=i;
            long t=0;
            HashSet<Integer> set=new HashSet<>();
            while(vis[src]!=true){
                vis[src]=true;
                set.add(src);
                src=edge[src];
                if(src==-1) break;;
            }
            if(src==-1 || !set.contains(src)) continue;
            int idx=src;
            do{
                t+=edge[idx];
                idx=edge[idx];
            }
            while(idx!=src);
                ans=Math.max(t,ans);
            
        }
        return ans;
    }
}
