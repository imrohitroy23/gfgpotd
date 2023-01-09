public class 10jan {

        public void toSumTree(Node root){
             //add code here.
            helper(root);
            
        }
        int helper(Node root){
             if(root==null) return 0;
             int leftsubtree=helper(root.left);
              int rightsubtree=helper(root.right);
              int temp=root.data;
              root.data=rightsubtree+leftsubtree;
              return leftsubtree+rightsubtree+temp;
        }
    
}
