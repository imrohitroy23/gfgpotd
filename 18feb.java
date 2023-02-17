public class 18feb {
    public static int appleSequence(int n, int m, String arr){
        int i=0;    
        int c=0;
        int len=0;
        
        for(int j=0; j<n; j++){
            if(arr.charAt(j) == 'O') c++;
            while(c > m){
                if(arr.charAt(i) == 'O') c--;
                i++;
            }
            len = Math.max(len, j-i+1);
        }
        return len;
    }
}
