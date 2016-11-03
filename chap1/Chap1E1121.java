//import java.util.Arrays;
//import java.util.Scanner;
/**
 * Exercises 1.1.21
 */
public class Chap1E1121 {
    public static void main(String[] args) {
        String name;
        int n1, n2;
        double ret;
        while (StdIn.hasNextLine())
        { // Read a number and cumulate the sum.
            name = StdIn.readString();
            n1 = StdIn.readInt();
            n2 = StdIn.readInt();
            if(n2 != 0)
            {
                ret = (double)n1/n2;
                StdOut.printf(name + " ");
                StdOut.printf("%.3f ", (double)n1);
                StdOut.printf("%.3f ", (double)n2);
                StdOut.printf("%.3f ", ret);
                StdOut.printf("\n");
            }else{
                StdOut.printf(name + " ");
                StdOut.printf("%.3f ", (double)n1);
                StdOut.printf("%.3f ", (double)n2);
                StdOut.printf("NaN\n");
            }    
        }
    }
}