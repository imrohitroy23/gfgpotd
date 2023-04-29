public class 29apr {
    public long findNumber(long n)
    {
        long ans=0;
        long num=1;
        while(n!=0){
            if(n%5==0){
                ans+=9*num;
                n=n/5-1;
            }
            else if(n%5==1){
                ans+=1*num;
                n/=5;
            }
            else if(n%5==2){
                ans+=3*num;
                n/=5;
            }
            else if(n%5==3){
                ans+=5*num;
                n/=5;
            }
            else if(n%5==4){
                ans+=7*num;
                n/=5;
            }
            num*=10;
        }
        return ans;
    }
}
