public class 16apr {
    Arrays.sort(A);
    Arrays.sort(B);
    ArrayList<Integer> Aeven = new ArrayList<>();
    ArrayList<Integer> Aodd = new ArrayList<>();
    ArrayList<Integer> Beven = new ArrayList<>();
    ArrayList<Integer> Bodd = new ArrayList<>();
    int sum1 =0, sum2 = 0;
    int s1=0;
    int s2=0;
    for(int i=0;i<A.length;i++){
        s1+=A[i];
        s2+=B[i];
        if(A[i]%2==0) Aeven.add(A[i]);
        else Aodd.add(A[i]);
        if(B[i]%2==0) Beven.add(B[i]);
        else Bodd.add(B[i]); 
        
    }
    long ans=0;
    if(s1!=s2 || Aeven.size()!=Beven.size()) return -1;
    for(int i=0;i<Aodd.size();i++) ans += Math.abs(Aodd.get(i) - Bodd.get(i));
    for(int i=0; i< Aeven.size(); i++) ans += Math.abs(Aeven.get(i) - Beven.get(i));
    return ans/4;
}
