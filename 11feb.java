public class 11feb {
    public static int getMinimumDays(int n, String S, int[] P) {
        // code here
        int ans=0;
        char[] c=S.toCharArray();
        for(int i=0;i<n;i++){
            int ind=P[i];
            if(ind==0){
                if(ind+1<n && c[ind]!='?' && c[ind]==c[ind+1]){
                    c[ind]='?';
                    ans=i+1;
                }
            }
            else if(ind==n-1){
                if(ind-1>=0 && c[ind]!='?' && c[ind]==c[ind-1]){
                    c[ind]='?';
                    ans=i+1;
                }
            }
            else{
                if(c[ind]!='?' && (c[ind]==c[ind-1] || c[ind]==c[ind+1])){
                     c[ind]='?';
                    ans=i+1;
                }
            }
        }
        return ans;
    }
}
