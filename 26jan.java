public class 26jan {
    public static String caseSort(String str)
    {
        // Your code here
        StringBuilder small = new StringBuilder();
        StringBuilder upper = new StringBuilder();
        
        for (char c : str.toCharArray()) {
            if (Character.isLowerCase(c)) small.append(c);
            else upper.append(c);
        }
        char sm[] = small.toString().toCharArray();
        char up[] = upper.toString().toCharArray();
        StringBuilder sb = new StringBuilder();
        
        Arrays.sort(sm);
        Arrays.sort(up);
        int i = 0, j = 0;
        for (char c : str.toCharArray()) {
            if (Character.isLowerCase(c)) sb.append(sm[i++]);
            else sb.append(up[j++]);
        }
        return sb.toString();
    }
}
