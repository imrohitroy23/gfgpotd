public class 17jan {
    

    int ans,max;
    int maxGCD(Node root) {
        // code here 
        ans=0;
        max=0;
        find(root);
        return ans;
    }
    int gcd(int a, int b){
        return b==0?a:gcd(b,a%b);
    }
    void find(Node root){
        if(root==null) return ;
        int gcd=0;
        if(root.left!=null && root.right!=null){
            gcd=gcd(root.left.data,root.right.data);
        }
        if(gcd>max){
            max=gcd;
            ans=root.data;
        }
        else if(gcd!=0 && gcd==max && ans<root.data){
            ans=root.data;
        }
        find(root.left);
        find(root.right);
    }
}



