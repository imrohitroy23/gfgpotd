class 11Dec{
    public boolean canPair(int[] nums, int k) {
      if(nums.length%2!=0) return false;
        
        int[] fre = new int[100001];
        for(int num : nums) {
            int num1 = num%k;
            if(fre[(k-num1)%k]!=0) {
                fre[(k-num1)%k]--;
            } else {
                fre[num1]++;
            }
        }
        for(int f : fre) {
            if(f>0) return false;
        }
        return true;
    }
}