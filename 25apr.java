public class 25apr {
    public int[] searchRange(int[] nums, int target) {
        int[] res={-1,-1};
        if(nums==null || nums.length==0) return res;
        int l=0;
        int r=nums.length-1;
        while(l<=r){
            int mid=(l+r)/2;
            if(nums[mid]==target){
                int s=mid;
                while(s>=l && nums[s]==target) s--;
                res[0]=s+1;
                int e=mid;
                while(e<=r && nums[e]==target) e++;
                res[1]=e-1;
                return res;
                
            }
            else if(nums[mid]<target) l=mid+1;
            else{
                r=mid-1;
            }
        }
        return res;
        
    }
}
