public class 09jun {
    public char nextGreatestLetter(char[] letters, char t) {
        int l=0;
        int r=letters.length-1;
        while(l<=r){
            int mid=(l+r)/2;
            if(letters[mid]>t) r=mid-1;
            else l=mid+1;
        }
        return letters[l%letters.length];
    }
}
