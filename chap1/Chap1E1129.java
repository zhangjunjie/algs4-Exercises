import java.util.Arrays;
//import java.util.Scanner;
/**
 * Exercises 1.1.29
 */
public class Chap1E1129 {
    public static int rank(int key, int[] a)
    {
        int lo = 0, hi = a.length-1, ret = -1;
        while(lo <= hi)
        {
            int mid = lo + (hi - lo)/2;
            if(key < a[mid]) hi = mid - 1;
            else if (key > a[mid]) lo = mid + 1;
            else {
                ret = mid;
                hi = mid - 1;
            }
        }
        return ret;
    }

    public static int count(int key, int[] a)
    {
        int ret = 0, idx;
        idx = rank(key, a);
        if(idx == -1)
            return ret;
        else{
            while(a[idx++] == key) {ret++;}
        }
        return ret;
    }

    public static void main(String[] args) {
        In in = new In(args[0]);
        int[] whitelist = in.readAllInts();
        int key = 77;
        // sort the array
        Arrays.sort(whitelist);
        for(int i = 0; i < whitelist.length; i++)
        {
            StdOut.printf(i+ ":" + whitelist[i] + " ");
        }
        StdOut.println();
        StdOut.println(rank(key, whitelist));
        StdOut.println(count(key, whitelist));
    }
}