//import java.util.Arrays;
//import java.util.Scanner;
/**
 * Exercises 1.1.12
 */
public class Chap1E1112 {
    public static void main(String[] args) {
        int size = 10;
        int[] a = new int[size];
        
        for(int i = 0; i < size; i++)
        {
            a[i] = 9 - i;
        }
      
        for(int i = 0; i < size; i++)
        {
            a[i] = a[a[i]];
        }

        for(int i = 0; i < size; i++)
        {
            StdOut.println(a[i]);
        }
    }
}