//import java.util.Arrays;
import java.lang.String;
/**
 * Exercises 1.1.33
 */
public class Chap1E1133 {
     // print the tableaux
    static void show(double[][] mat) {
        int row, col;
        row = mat.length;
        col = mat[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                StdOut.printf("%8.3f ", mat[i][j]);
            }
            StdOut.println();
        }
        StdOut.println();
    }
    static double dot(double[]x, double[] y)
    {
        double ret = 0;
        if (x.length != y.length) {
                throw new ArithmeticException("Should have equal length");
        }
        
        for(int i = 0; i < x.length; i++)
        {
            ret += x[i]*y[i];
        }
        return ret;        
    }
    
    static double[][] mult(double[][] a, double[][] b)
    {
        int a_r, a_c, b_r, b_c, i, j, k;
        a_r = a.length; a_c = a[0].length; b_r = b.length; b_c = b[0].length;
        double tmp=0;
        
        double[][] ret = new double[a_r][b_c];
        for(i = 0; i < a_r; i++)
        {
            for(k = 0; k < b_c; k++)
            {
                tmp = 0;
                for(j = 0; j < a_c; j++)
                {
                    tmp += a[i][j]*b[j][k];
                }
                ret[i][k] = tmp;
            }
        }
        return ret;
    }
    
    static double[] mult(double[][] a, double[] x)
    {
        int a_r, a_c, i, j;
        a_r = a.length; a_c = a[0].length;
        double tmp=0;
        
        double[] ret = new double[a_r];
        for(i = 0; i < a_r; i++)
        {
               tmp = 0;
               for(j = 0; j < a_c; j++)
                {
                    tmp += a[i][j]*x[j];
                }
                ret[i] = tmp;
        }
        return ret;
    }

    static double[] mult(double[]y, double[][] a)
    {
        int a_r, a_c, y_len, i, j;
        a_r = a.length; a_c = a[0].length; y_len = y.length;
        double tmp=0;
        
        double[] ret = new double[a_c];
        for(i = 0; i < y_len; i++)
        {
               tmp = 0;
               for(j = 0; j < a_r; j++)
                {
                    tmp += y[i]*a[j][i];
                }
                ret[i] = tmp;
        }
        return ret;
    }

    static double[][] transpose(double [][] a)
    {
        int row = a.length, col = a[0].length;
        double[][] ret = new double[col][row];
        for(int i = 0; i < row; i++)
            for(int j = 0; j < col; j++)
                ret[j][i] = a[i][j];
        
        return ret;
    }
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