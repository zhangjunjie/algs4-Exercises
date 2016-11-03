import java.util.Arrays;
//import java.util.Scanner;
/**
 * Exercises 1.1.23
 */
public class Chap1E1123 {
    public static int rank(int key, int[] a)
    {
        int lo = 0, hi = a.length-1;
        while(lo <= hi)
        {
            int mid = lo + (hi - lo)/2;
            if(key < a[mid]) hi = mid - 1;
            else if (key > a[mid]) lo = mid + 1;
            else return mid;
        }
        return -1;
    }
    public static void main(String[] args) {
        In in = new In(args[0]);
        int[] whitelist = in.readAllInts();

        // sort the array
        Arrays.sort(whitelist);

        // read integer key from standard input; print if not in whitelist
        while (!StdIn.isEmpty()) {
            int key = StdIn.readInt();
            StdOut.println(""+key);
            if (Chap1E1123.rank(key, whitelist) == -1)
            {
                StdOut.println("+"+key);
            }else {
                StdOut.println("-"+key);
            }
        }
    }
}