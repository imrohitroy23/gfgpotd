class 10Dec{
    static String buildLowestNumber(String str, int k) {
    Stack<Character> stack=new Stack<>();
        
    for(int i=0;i<str.length();i++){
        char c=str.charAt(i);
        while(!stack.isEmpty() && stack.peek()>c &&k>0){
            k--;
            stack.pop();
        }
        stack.push(c);
    }
    StringBuilder sb=new StringBuilder();
    while(!stack.isEmpty()){
        char c=stack.pop();
        if(k>0){
            k--;
            continue;
        }
        sb.append(Character.toString(c));
    }
    String ans=sb.reverse().toString();
    for(int i=0;i<ans.length();i++) {
        if(ans.charAt(i)!='0') return ans.substring(i);
    }
    return "0";
}
}