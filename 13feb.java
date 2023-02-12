public class 13feb {
    static int inSequence(int a, int  b, int c){
        // code here
        if(c==0) return a==b?1:0;
        if(a==b) return 1;
        int d=b-a;
        if(d%c==0 && d/c>=0) return 1;
        return 0;
    }
}
