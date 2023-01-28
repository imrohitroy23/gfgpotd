public class 29jan {
    public static int solve(int a, int b) {
        // code here
        if(a==b) return 0;
        if((a&b)==Math.min(a,b)) return 1;
        return 2;
        
        
    }
}
