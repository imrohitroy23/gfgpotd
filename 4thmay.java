public class 4thmay {
    public String predictPartyVictory(String s) {
        int n = s.length();
        Queue<Integer> radiant = new LinkedList<>();
        Queue<Integer> dire = new LinkedList<>();
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='R') radiant.offer(i);
            else{
                dire.add(i);
            }
        }
        while(!radiant.isEmpty() && !dire.isEmpty()){
            int r=radiant.poll();
            int d=dire.poll();
            if(r<d){
                radiant.add(r+n);
                
            }
            else{
                dire.add(d+n);
            }
        }
        return radiant.isEmpty()?"Dire":"Radiant";
    }
}
