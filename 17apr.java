public class 17apr {
    Arrays.sort(arr,(a,b)-> Integer.compare(b.profit,a.profit));
        Map<Integer, Integer> map=new HashMap<>();
        int totalProfits=0;
        int totalJobs=0;
        for(int i=0;i<n;i++)
        {
            int profit=arr[i].profit;
            int dead=arr[i].deadline;
            
            for(int j=dead;j>=1;j--){
                if(!map.containsKey(j)){
                    totalProfits=totalProfits+profit;
                    totalJobs=totalJobs+1;
                    map.put(j,1);
                    break;
                }
            }
        }
        int[] res=new int[2];
        res[0]=totalJobs;
        res[1]=totalProfits;
        
        
        return res;
}
