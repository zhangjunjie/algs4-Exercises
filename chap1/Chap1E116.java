//import java.util.Arrays;
//import java.util.Scanner;
/**
 * Exercises 1.1.6
 */
public class Chap1E116 {
    public static void main(String[] args) {
        int f = 0, g = 1;
        
        for ( int i = 0; i <= 15; i++)
        {
            StdOut.println(f);//StdOut.println(g);
            f = f + g;
            g = f - g;
        }
    }
}