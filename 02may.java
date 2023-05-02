public class 02may {
    int maxSweetness(int [] ss, int N, int K) {
	    // Write your code here.
	    
	    int l=1;
	    int r=0;
	    for(int i=0;i<N;i++) r+=ss[i];
	    int ans=0;
	    while(l<=r){
	        int mid=(l+r)/2;
	        int c=0;
	        int su=0;
	        for(int i=0;i<N;i++){
	            su+=ss[i];
	            if(su>=mid){
	                c++;
	                su=0;
	            }
	        }
	        if(c>=K+1){
	            ans=mid;
	            l=mid+1;
	        }
	        else{
	            r=mid-1;
	        }
	    }
	    return ans;
	}
}
