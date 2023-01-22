class 23jan{
    public static String removePair(String s) {
        // code here
        Stack<Character> st=new Stack<>();
        
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(!st.isEmpty() && st.peek()==c) st.pop();
            else st.push(c);
        }
        if(st.isEmpty()) return "-1";
        StringBuilder stt=new StringBuilder();
        while(!st.isEmpty()) stt.append(st.pop());
        return stt.reverse().toString();
    }
}
}