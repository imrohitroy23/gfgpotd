public class 27feb {
    public static Node reverse(Node head, int k) {
        // code here
        Node temp=head;
        ArrayList<Integer> a1 = new ArrayList<>();
        ArrayList<Integer> a2 = new ArrayList<>();
        while(temp!=null && k>0){
            a1.add(temp.data);
            temp=temp.next;
            k--;
        }
        while(temp!=null){
            a2.add(temp.data);
            temp=temp.next;
        }
        temp=head;
        for(int i=a1.size()-1;i>=0;i--){
            temp.data=a1.get(i);
            temp=temp.next;
        }
        for(int i=a2.size()-1;i>=0;i--){
            temp.data=a2.get(i);
            temp=temp.next;
        }
        return head;
        
    }
}
