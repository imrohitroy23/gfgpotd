public class 18Apr {
    static int minL;
    static int len;
    public static int minSubtreeSumBST(int target, Node root) {
        minL = Integer.MAX_VALUE;
        len = 0;
        sum(root,target);
        
        return minL==Integer.MAX_VALUE ? -1:minL;
    }
    public static void size(Node root){
        if(root == null){
            return;
        }
        len+=1;
        size(root.left);
        size(root.right);
    }
    public static int sum(Node root,int target){
        if(root == null){
            return 0;
        }
        if(root.left == null && root.right == null){
            if(root.data == target){
                minL = 1;
            }
            return root.data;
        }
        int s = root.data + sum(root.left,target)+sum(root.right,target);
        if(s == target){
            len = 0;
            size(root);
            if(isBST(root)){
                minL = Math.min(minL,len);
            }
        }
        return s;
    }
    public static boolean isBST(Node root){
        int max=Integer.MAX_VALUE;
        int min=Integer.MIN_VALUE;
        return ch(root,max,min);
    }
    static boolean ch(Node root, int max,int min){
        if(root==null) return true;
        if(root.data<=min || root.data>=max) return false;
        boolean left=ch(root.left,root.data,min);
        boolean ri=ch(root.right,max,root.data);
        return left && ri;
    }
}
