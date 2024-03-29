public class 24jan {
    void convert(int[] arr, int n) {
        // code here
        int temp[] = arr.clone();
 
        // Sort temp array
        Arrays.sort(temp);
 
        // Create a hash table.
        HashMap<Integer, Integer> umap = new HashMap<>();
 
        // One by one insert elements of sorted
        // temp[] and assign them values from 0
        // to n-1
        int val = 0;
        for (int i = 0; i < n; i++)
            umap.put(temp[i], val++);
 
        // Convert array by taking positions from
        // umap
        for (int i = 0; i < n; i++)
            arr[i] = umap.get(arr[i]);
    }
}
