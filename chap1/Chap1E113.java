//import java.util.Arrays;
//import java.util.Scanner;
/**
 * Exercises 1.1.3
 */
public class Chap1E113 {
    public static void main(String[] args) {
        int a, b, c;
        a = Integer.parseInt(args[0]);
        b = Integer.parseInt(args[1]);
        c = Integer.parseInt(args[2]);
        
        if(a == b && b == c){
            StdOut.println("equal");
        }else{
            StdOut.println("not equal");
        }
    }
}