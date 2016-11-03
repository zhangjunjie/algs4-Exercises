//import java.util.Arrays;
//import java.util.Scanner;
/**
 * Exercises 1.1.16
 */
public class Chap1E1116 {
    public static String exR1(int n)
    {
        if(n <= 0) return "";
        return exR1(n-3) + n + exR1(n-2) + n;
    }
    
    public static void main(String[] args) {
        String ret;
        int N = 6;
        ret = exR1(N);
        StdOut.println(ret);
    }
}