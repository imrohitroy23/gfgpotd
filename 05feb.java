public class 05feb {
    int intersectPoint(Node head1, Node head2)
	{
         // code here
         Node a=head1;
         Node b=head2;
         while(a!=b){
             a=a==null?head2:a.next;
             b=b==null?head1:b.next;
         }
         return b.data;
	}
}
