import java.util.Arrays;
import java.lang.String;
/**
 * Exercises 1.1.38
 */
public class Chap1E1138 {
    private static double start;
    public static void Stopwatch() {
        start = System.currentTimeMillis();
    } 


    /**
     * Returns the elapsed CPU time (in seconds) since the stopwatch was created.
     *
     * @return elapsed CPU time (in seconds) since the stopwatch was created
     */
    public double elapsedTime() {
        double now = System.currentTimeMillis();
        return (now - start) / 1000.0;
    }
    
    public static int BinarySearch(int key, int[] a)
    {
        int lo = 0, hi = a.length-1;
        while(lo <= hi)
        {
            int mid = lo + (hi - lo)/2;
            if(key == a[mid])
            {
                return mid;
            }else if(key < a[mid]){
                hi = mid - 1;
            }else{
                lo = mid + 1;
            }
        }
        return -1;
    }
    public static int ForceSearch(int key, int[] a)
    {
        for(int i = 0; i < a.length; i++)
        {
            if(a[i] == key)
                return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] whitelist = In.readInts(args[0]);
        int[] forcelist = In.readInts(args[0]);
        
        Arrays.sort(whitelist);
        for(int i = 0; i < 10; i++)
        {
            int idx = StdRandom.uniform(forcelist.length);
            int key = forcelist[idx];
            long start = System.currentTimeMillis();
            StdOut.printf("%d \n", start);
            if(BinarySearch(key, whitelist) != -1)
            {
                long end = System.currentTimeMillis();
                StdOut.printf("BS find %d at %d costing (%d miniseconds)\n", key, idx, end - start);
            }
            start = System.currentTimeMillis();
            StdOut.printf("%d \n", start);
            if(ForceSearch(key, forcelist) != -1)
            {
                long end = System.currentTimeMillis();
                StdOut.printf("FS find %d at %d  costing (%d miniseconds)\n", key, idx, end - start);
            }
        }
    }
}