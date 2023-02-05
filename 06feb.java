public class 06feb {
    long verticallyDownBST(Node root,int target)
    {
        if(root==null) return -1;
        if(root.data==target){
            return verti(root,0)-target;
        }
        return Math.max( verticallyDownBST(root.left,target), verticallyDownBST(root.right,target));
        
    }
    long verti(Node root,int dist){
        long ans=0;
        if(root==null) return 0;
        if(dist==0) ans+=root.data;
        ans+=verti(root.left,dist-1)+ verti(root.right,dist+1);
        return ans;
    }
    
}
