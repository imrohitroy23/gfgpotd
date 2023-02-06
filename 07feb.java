public class 07feb {
    int ans=0;
        int curr=0;
        int prod=1;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                curr=0;
                prod=1;
                continue;
            }
            curr++;
            prod*=(arr[i]<0?-1:1);
            if(prod>0) ans=Math.max(ans,curr);
        }
        
         curr=0;
         prod=1;
        for(int i=n-1;i>=0;i--){
            if(arr[i]==0){
                curr=0;
                prod=1;
                continue;
            }
            curr++;
            prod*=(arr[i]<0?-1:1);
            if(prod>0) ans=Math.max(ans,curr);
        }
        return ans;
    
}
