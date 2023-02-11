public class 12feb {
    Node primeList(Node head){
        //code here
        Node curr=head;
        while(curr!=null){
            if(curr.val==1) curr.val=2;
            else if(!isPrime(curr.val)){
                int val=curr.val;
                int pre=prevPrime(val-1);
                int nex=nextPrime(val+1);
                curr.val=Math.abs(val-nex)>=Math.abs(val-pre)?pre:nex;
            }
            curr=curr.next;
            
        }
        return head;
        
    }
    int prevPrime(int val){
        while(val>=2){
            if(isPrime(val)){
                return val;
            }
        val--;    
        }
        return -1;
    }
    int nextPrime(int val){
        while(!isPrime(val)) val++;
        return val;
    }
    
    boolean isPrime(int d){
        if(d<2) return false;
        for(int i=2;i*i<=d;i++){
            if(d%i==0){
                return false;
            }
        }
    return true;
        
    }
}
