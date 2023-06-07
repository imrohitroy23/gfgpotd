public class 07jun {
    public int minFlips(int a, int b, int c) {
        int ans=0;
        while(a!=0 || b!=0 || c!=0){
            int x1=a&1;
            int x2=b&1;
            int c3=c&1;
            if((x1|x2)!=c3) if((x1&x2)==1) ans+=2;
            else ans+=1;
            
        
        a>>=1;
        b>>=1;
        c>>=1;
        }
        return ans;
    }
    
}
