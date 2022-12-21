
class 21Dec
{
	Node sortList(Node head) {
		// Your code here
		Node prev=head, curr=head.next;
		while(curr!=null){
		    if(curr.data<0){
		        
		    prev.next=curr.next;
		        curr.next=head;
		        head=curr;
		        curr=prev.next;
		    }
		    else{
		        prev=curr;
		        curr=curr.next;
		    }      
		}
		return head;
	}
}