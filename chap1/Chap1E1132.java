//import java.util.Arrays;
import java.lang.String;
/**
 * Exercises 1.1.32
 */
public class Chap1E1132 {
    public static void main(String[] args) {
       int N;
       double l, r;
       double step = 0.1, len;
       N = Integer.parseInt(args[0]);
       l =   Double.parseDouble(args[1]);
       r =   Double.parseDouble(args[2]);
       len = r - l;
       int[] a= new int[N];
       while(!StdIn.isEmpty()){
           double num =  StdIn.readDouble();
           if(num >= l && num <= r)
           {
               double tmp = N*(num-l)/len;
               int idx = (int)tmp;
               a[idx]++;
               double x = 1.0*idx/N;
               double y = a[idx]*step/2.0;
               double rw = 0.5/N;
               double rh = a[idx]*step/2.0;
               StdDraw.filledRectangle(x, y, rw, rh);
           }
       }                     
    }
}