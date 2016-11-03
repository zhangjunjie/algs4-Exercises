//import java.util.Arrays;
//import java.util.Scanner;
/**
 * Exercises 1.1.22
 */
public class Chap1E1122 {
    public static void indent(int space)
    {
        for(int i = 0; i < space; i++)
            StdOut.printf(" ");
    }
    public static int rank(int key, int[] a)
    {
        return rank(key, a, 0, a.length-1, 1);
    }
    public static int rank(int key, int[] a, int lo, int hi, int depth)
    {
        if(lo > hi) return -1;
        int mid = lo + (hi - lo)/2;
        indent(depth);
        if(key < a[mid])
        {
            StdOut.println(" " + lo + " " + hi);
            return rank(key, a, lo, mid-1, depth+1);
        }else if(key > a[mid])
        {
            StdOut.println(" " + lo + " " + hi);
            return rank(key, a, mid+1, hi, depth+1);
        }else{
            return mid;
        }

    }
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8,9};
        int ret, key = 10;
        ret = rank(key, a);
        StdOut.println(""+ret);
    }
}