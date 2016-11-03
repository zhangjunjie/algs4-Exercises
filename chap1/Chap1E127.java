/**
 * Exercises 1.2.7
 */
public class Chap1E127 {
       public static String mystery(String s)
       {
           int N = s.length();
           if(N <= 1) return s;
           String a = s.substring(0, N/2);
           String b = s.substring(N/2, N);
           return mystery(b)+mystery(a);
       }
       
       public static void main(String[] args) {
           String s1 = "ACTGACG", s2;
 
           s2 = mystery(s1);
           StdOut.println("s1:"+s1);
           StdOut.println("s2:"+s2);
       }
}