class 04jun {
    public int numOfMinutes(int n, int headID, int[] m, int[] it) {
        List<List<Integer>> employees = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            employees.add(new ArrayList<>());
        }
        for(int i=0;i<n;i++){
            if(m[i]!=-1) employees.get(m[i]).add(i);
        }
        return inf(headID, employees,it);
    }
    public int inf(int ce,List<List<Integer>> employees,int[] it){
        int max=0;
        for(int sub:employees.get(ce)){
            int tt=inf(sub,employees,it);
            max=Math.max(max,tt);
        }
        return max+it[ce];
    }
}