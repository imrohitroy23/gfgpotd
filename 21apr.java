public class 21apr {
    public int prefixSuffixString(String s1[],String s2[])
    {
        int c=0;
        for(String s: s2){
            for(String w:s1){
                if(w.startsWith(s) || w.endsWith(s)){
                    c++;
                    break;
                    
                }
            }
        }
        return c;
    }
}
