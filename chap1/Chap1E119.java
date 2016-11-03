//import java.util.Arrays;
//import java.util.Scanner;
/**
 * Exercises 1.1.9
 */
public class Chap1E119 {
    public static void main(String[] args) {
        int a = 100;
        
       StdOut.println(Integer.toBinaryString(a));
       
       String s = "";
       for(int i = a; i > 0; i /=2){
           s = (i%2)+s;
       }
       StdOut.println(s);
    }
}