/**
 * Exercises 1.2.8
 */
public class Chap1E128 {
        
       public static void main(String[] args) {
           int[] a = {1,2,3,4};
           int[] b = {5,6,7,8,9};
           int[] t = a; a = b; b = t;
           
           StdOut.println("a:");
           for(int i = 0; i < a.length; i++)
           {
               StdOut.printf("%d ", a[i]);
           }
           StdOut.println("\nb:");
           for(int i = 0; i < b.length; i++)
           {
               StdOut.printf("%d ", b[i]);
           }
           StdOut.println();
       }
}