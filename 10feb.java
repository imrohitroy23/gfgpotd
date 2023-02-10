public class 10feb {
        public int maxInstance(String s) {
            // Code here
            int b = 0, a = 0, l = 0, o = 0, n = 0;
            for(int i=0;i<s.length();i++){
                char ch=s.charAt(i);
                if(ch=='b')b++;
                else if(ch=='a') a++;
                else if(ch=='l') l++;
                else if(ch=='o') o++;
                else if(ch=='n') n++;
            }
            l/=2;
            o/=2;
            int mini=b;
            if(mini>a) mini=a;
             if(mini > l) mini = l;
            if(mini > o) mini = o;
            if(mini > n) mini = n;
            return mini;
        }
}
