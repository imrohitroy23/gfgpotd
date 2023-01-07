public class 7jan {
    Node flatten(Node root)
    {
	// Your code here
	if(root==null || root.next==null) return root;
	Node head=root, nextHead=root.next;
	while(nextHead!=null){
	    Node temp=nextHead.next;
	    head.next=null;
	    nextHead.next=null;
	    head=merge(head,nextHead);
	    nextHead=temp;
	    
	}
	return head;
    }
    
    
    Node merge(Node head,Node head2){
        if(head==null) return head2;
        if(head2==null) return head;
        if(head.data<=head2.data){
            head.bottom=merge(head.bottom,head2);
            return head;
        }
        head2.bottom=merge(head,head2.bottom);
        return head2;
    }
    
}
