public class 23apr {
    
    public static int minimumNumber(int n, int[] arr) {
        // code here
        int ans = arr[0];
        
        for(int i=1;i<n;i++)
        {
            ans = gcd(ans,arr[i]);
        }
        
        return ans;
    }
    
    
    static int gcd(int a ,int b)
    {
        while( a!=b)
        {
            if(a>b)
            {
                a=a-b;
            }
            else
            {
                b=b-a;
            }
        }
        
        return b;
    
    }
    
}
