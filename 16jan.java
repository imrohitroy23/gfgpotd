public class 16jan {
 
        public static long[] nextLargerElement(long[] arr, int n) { 
            // Your code here
            long[] ans=new long[n];
            Stack<Long> st=new Stack<>();
            st.push(-1l);
            for(int i=n-1;i>=0;i--){
                while(st.size()>1 && st.peek()<=arr[i]) st.pop();
            
                ans[i]=st.peek();
                st.push(arr[i]);
            }
            return ans;
        }
    
}
