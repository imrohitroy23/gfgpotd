public class longestString {

        public static String longestString(int n, String[] arr) {
            // code here
            Arrays.sort(arr);
            Set<String> set = new HashSet<>(Arrays.asList(arr));
            String dada = "";
            for (String s : arr) {
                boolean found = true;
                for (int i = 1; i < s.length(); i++) {
                    if (!set.contains(s.substring(0, i))) {
                        found = false;
                        break;
                    }
                }
                if (found && s.length() > dada.length()) {
                    dada = s;
                }
            }
            return dada;
        }    
    }
