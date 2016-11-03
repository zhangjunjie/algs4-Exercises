//import java.util.Arrays;
//import java.util.Scanner;
/**
 * Exercises 1.1.24
 */
public class Chap1E1124 {
    public static int gcd(int p, int q)
    {
        StdOut.println(p + " " + q);
        if(q == 0) return p;
        int r = p % q;
        return gcd(q, r);
    }
    public static void main(String[] args) {
        int p = Integer.parseInt(args[0]);
        int q = Integer.parseInt(args[1]);
        
        StdOut.println(""+gcd(p,q));
    }
}