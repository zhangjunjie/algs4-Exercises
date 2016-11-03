//import java.util.Arrays;
//import java.util.Scanner;
/**
 * Exercises 1.1.31
 */
public class Chap1E1131 {
    public static void main(String[] args) {
        double x0, y0, r, p;
        int N;
        x0 = Double.parseDouble(args[0]);
        y0 = Double.parseDouble(args[1]);
        r = Double.parseDouble(args[2]);
        N = Integer.parseInt(args[3]);
        p = Double.parseDouble(args[4]);
        double[] x = new double[N];
        double[] y = new double[N];
        int tri = 360/N;
        StdOut.println(tri+"");
        for(int i = 0; i < N; i++)
        {
            x[i] = x0+r*Math.cos(Math.toRadians(i*tri));
            y[i] = y0+r*Math.sin(Math.toRadians(i*tri));
        }
        StdDraw.circle(x0, y0, r);
        for(int i = 0; i < N; i++)
        {
            StdDraw.circle(x[i], y[i], 0.05);
//            StdDraw.point(x[i], y[i]);
        }
        StdDraw.setPenColor(StdDraw.GRAY);
        for(int i = 1; i < N; i++)
        {
            if(StdRandom.random() <= p)
                StdDraw.line(x[i-1], y[i-1], x[i], y[i]);
        }
//        StdDraw.polygon(x, y);
    }
}