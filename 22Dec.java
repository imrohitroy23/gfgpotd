class 22Dec{
public static long findSubarray(long[] arr ,int n) {
        long sum = 0;
        int ans = 0;
        
        HashMap<Long, Integer> hmap = new HashMap<>();
        hmap.put(sum, 1);
        
        for(int i = 0; i < n; i++){
            sum += arr[i];
            
            if(hmap.containsKey(sum)){
                ans += hmap.get(sum);
            }
            hmap.put(sum, hmap.getOrDefault(sum, 0) + 1);
        }
        
        return ans;
}
}
