public class 31dec {

        public int minLaptops(int N, int[] start, int[] end) {
            // code here
            Arrays.sort(start);
            Arrays.sort(end);
            int minlap=1;
            int i=1,j=0;
            while(i<N && j<N){
                if(start[i]<end[j]){
                    minlap++;
                }
                else{
                    j++;
                }
                i++;
            }
            return minlap;
        }
    
}
