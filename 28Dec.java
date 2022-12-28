public class 28Dec {
    

    static int ans;
    public static int findLargestSubtreeSum(Node root) {
        // code here
        ans=Integer.MIN_VALUE;
        p(root);
        return ans;
    }
     public static int p(Node root) {
    
        if(root==null) return 0;
        int l=p(root.left);
        int r=p(root.right);
        ans=Math.max(ans,root.data+l+r);
        return root.data+l+r;
     }
    
}
      
