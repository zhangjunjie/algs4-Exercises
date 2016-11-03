import java.util.Arrays;
import java.lang.String;
/**
 * Exercises 1.1.39
 */
public class Chap1E1139 {
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

     public static void main(String[] args) {
        int T = Integer.parseInt(args[0]);
        int LEN = 1000;
        int[] arr1 = new int[LEN];
        int[] arr2 = new int[LEN];
        long sum = 0;
        int rep = 0;
        for(int i = 0; i < LEN; i++)
        {
            arr1[i] = 100000 + StdRandom.uniform(100000);
        }

        for(int i = 0; i < LEN; i++)
        {
            arr2[i] = 100000 + StdRandom.uniform(100000);
        }

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        
        for(int i = 0; i < arr1.length; i++)
        {
            int key = arr1[i];
            if(BinarySearch(key, arr2) != -1)
            {
                sum += key;
                rep++;
            }
        }
        StdOut.printf("match %d times, ave = %d \n", rep, sum/rep);
    }
}