public class 09mar {
    static int check(String s1,String s2){

        char a1[] = s1.toCharArray();

        char a2[] = s2.toCharArray();

        Arrays.sort(a1);

        Arrays.sort(a2);

        if(String.valueOf(a1).equals(String.valueOf(a2)))

            return 1;

        return 0;

    }

    static void returnList(String e, ArrayList<Node> ans1){

 

        Node q= new Node('0');

        Node start=q;

        for(int i=0;i<e.length();i++){

            q.next=new Node(e.charAt(i));

            q=q.next;

        }

 

        ans1.add(start.next);

    }

    public static ArrayList<Node> findAnagrams(Node head, String s) {

        // code here

        

        String s1 = "";

        ArrayList<Node> l = new ArrayList<>();

        while(head!=null){

            s1 += head.data;

            if(s1.length()==s.length()){

                if(check(s1,s)==1){

                    returnList(s1,l);

                    s1="";

                }else{

                    s1=s1.substring(1);

                }

            }

            head = head.next;

        }

        return l;
        }
}
