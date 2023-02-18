public class 19feb {
    ArrayList<Integer> a=new ArrayList<>();
    int i=0;
    void traverse(Node root){
        if(root==null) return ;
        traverse(root.left);
        a.add(root.data);
        traverse(root.right);
    }
    void insert(Node root){
        if(root==null) return ;
        insert(root.left);
        root.data=a.get(i++);
        insert(root.right);
        
    }
    public Node correctBST(Node root) {
        // code here.
        traverse(root);
        Collections.sort(a);
        insert(root);
        return root;
    }
}
