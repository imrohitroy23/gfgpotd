public class 12jan {
    long minimizeSum(int N, int arr[]) {
        if(N==1)
        return 0;
        
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        
        long sum=0;
        for(int i=0;i<N;i++){
            pq.add(arr[i]);
        }
        
        for(int i=1;i<N;i++){
            int temp=pq.poll()+pq.poll();
            sum=sum+temp;
            pq.add(temp);
        }
        
        return sum;
    }
}