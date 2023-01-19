public class 20jan {
    public int maxWeightCell(int N, int Edge[]){
        int arr[]=new int[N];
        for(int i=0;i<N;i++) if(Edge[i]!=-1) arr[Edge[i]]+=i;
        int ans=0;
        for(int i=1;i<N;i++){
            if(arr[i]>=arr[ans]) ans=i;
        }
        return ans;
     }
}
