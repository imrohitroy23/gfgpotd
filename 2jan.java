class 2jan{
    ArrayList<Integer> maximumValue(Node node) {
       //code here
       Queue<Node> q=new LinkedList<>();
        ArrayList<Integer> ans = new ArrayList<>();
        q.offer(node);
        while(!q.isEmpty()){
            int s=q.size();
            int max=Integer.MIN_VALUE;
            while(s-->0){
                Node curr=q.poll();
                max=Math.max(curr.data,max);
                if(curr.left!=null) {
                    q.offer(curr.left);
                }
                if(curr.right!=null) {
                    q.offer(curr.right);
                }
            }
            ans.add(max);
        }
        return ans;
    }
}