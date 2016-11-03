//import java.util.Arrays;
//import java.util.Scanner;
/**
 * Exercises 1.1.25
 */
public class Chap1E1125 {
    public static void main(String[] args) {
        int a, b, c, t;
        a = Integer.parseInt(args[0]);
        b = Integer.parseInt(args[1]);
        c = Integer.parseInt(args[2]);
        if(a > b) { t = a; a = b; b = t;}
        if(a > c) { t = a; a = c; c = t;}
        if(b > c) { t = b; b = c; c = t;}
        StdOut.println(a + " " + b + " " + c);
    }
}