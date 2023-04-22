public class 22apr {
    long sum=0;
        long[] a=new long[n];
        int[] arr1=new int[n];
        for(int i=0;i<n;i++)
        {
            arr1[i]=arr[i];
        }
        Arrays.sort(arr1);
        HashMap<Integer,Long>map=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            if(!map.containsKey(arr1[i]))
            {
            map.put(arr1[i],sum);
            }
            sum=sum+arr1[i];
        }
        for(int i=0;i<n;i++)
        {
            a[i]=map.get(arr[i]);
        }
        return a;
        
}
