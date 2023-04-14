
class 14apr1{
public static int finLength(int N, int[] color, int[] radius) {
        // code here
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<N;i++){
            
            if(!st.isEmpty() && color[i]==color[st.peek()] && radius[i]==radius[st.peek()]) st.pop();
            else st.push(i);
        }
        return st.size();
    }
}