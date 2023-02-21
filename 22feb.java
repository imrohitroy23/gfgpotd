public class 22feb {
    public void connect(Node r) {
        // code here
        if(r==null) return ;
        Queue<Node> q=new LinkedList<>();
        q.add(r);
        while(!q.isEmpty()){
            int s=q.size();
            Node c=null;
            while(s-->0){
                c=q.poll();
                c.nextRight=q.peek();
                if(c.left!=null) q.add(c.left);
                if(c.right!=null) q.add(c.right);
            }
            c.nextRight=null;
        }
    }
}
