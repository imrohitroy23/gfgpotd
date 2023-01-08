class 8jan {
	static long countPairs(int n, int[] arr, int k) {
		// code here
		int ans=0;
		HashMap<Integer,Integer> map=new HashMap<>();
		for(int i=0;i<n;i++){
		    int rem=arr[i]%k;
		    if(map.containsKey(rem)){
		        ans+=map.get(rem);
		    }
		    map.put(rem,map.getOrDefault(rem,0)+1);
		}
		return ans;
	}
}