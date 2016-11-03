/**
 * Exercises 1.2.6
 */
public class Chap1E126 {
       public static Boolean cirRot(String s1, String s2)
       {
           int len = s1.length();
           if(s1.length() != s2.length())
               return false;
           for(int i = 0; i < len; i++)
           {
               String tmp = s1.substring(i, len)+s1.substring(0,i);
               if(s2.indexOf(tmp) == 0)
                   return true;
           }
           return false;
       }
       
       public static void main(String[] args) {
           String s1 = "ACTGACG", s2 = "TGACGAC";
           if(cirRot(s1, s2) == true)
               StdOut.println("Circular Rotation.");
           else
               StdOut.println("Not Circular Rotation.");
       }
}