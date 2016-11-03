import java.util.Arrays;
//import java.util.Scanner;
/**
 * Exercises 1.1.28
 */
public class Chap1E1128 {
    public static void removeDup(int[] a)
    {
        int idx = 0;
        for(int i = 0; i < a.length; i++)
        {
            if(a[i] != a[idx])
                a[++idx] = a[i];
        }
//        StdOut.println(idx + "");
        return;
    }
    public static void main(String[] args) {
        In in = new In(args[0]);
        int[] whitelist = in.readAllInts();

        // sort the array
        Arrays.sort(whitelist);
        for(int i = 0; i < whitelist.length; i++)
        {
            StdOut.printf(whitelist[i]+" ");
        }
        removeDup(whitelist);
        StdOut.println();
        for(int i = 0; i < whitelist.length; i++)
        {
            StdOut.printf(whitelist[i]+" ");
        }
        StdOut.println();
    }
}