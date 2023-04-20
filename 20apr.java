public class 20apr {
    static int sum;
    static void sub(Node n, int d){
        if(n==null || d<0) return;
        sum+=n.data;
        sub(n.left,d-1);
        sub(n.right,d-1);
    }
    
    static int trav(Node n, int t,int k){
        if(n==null) return -1;
        if(n.data==t){
            sub(n,k);
            return k-1;
        }
        int dd=trav(n.left,t,k);
        if(dd>-1){
            sum+=n.data;
            sub(n.right,dd-1);
            return dd-1;
        }
        dd=trav(n.right,t,k);
        if(dd>-1){
            sum+=n.data;
            sub(n.left,dd-1);
            return dd-1;
        }
        return -1;
    }
    static int ladoos(Node root, int home, int k){
        // Your code goes here
        sum=0;
        trav(root,home,k);
        return sum;
    }
}
