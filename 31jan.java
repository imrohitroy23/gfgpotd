class 31jan{
    static int minRepeats(String A, String B) {
        // code here
        int c=1;
        String str=A;
        while(str.length()<B.length()){
            str+=A;
            c++;
        }
        if(str.contains(B)) return c;
        str+=A;
        if(str.contains(B)) return c+1;
        return -1;
    }
    
}