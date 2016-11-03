/**
 * Exercises 1.3.5
 */
import java.util.*;
public class Chap1E135 /*Stack*/ {
    static void printBinary(int N)
    {
        Stack<Integer> st = new Stack<Integer>();
        while(N > 0)
        {
            st.push(N%2);
            N = N/2;
        }
        StdOut.println("Print with for loop:");
        for(int d : st) StdOut.print(d);
        StdOut.println();
        StdOut.println("Print with pop:");
        while(!st.isEmpty()){
            StdOut.print(st.pop());
        };
        StdOut.println();
    }
    
        public static void main(String[] args) {
            int N = Integer.parseInt(args[0]);
            printBinary(N);
    }
}