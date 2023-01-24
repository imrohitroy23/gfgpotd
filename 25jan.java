public class 25jan {
    int minOperation(String s) {
        // code here
        int n=s.length();
        if(n<=3) return s.length();
        int l=n/2-1;
        while(l>=0){
            if(s.substring(0,l+1).equals(s.substring(l+1,2*l+2))){
                break;
            }
            l--;
        }
        if(l==-1) return s.length();
        return n-l;
    }
}
