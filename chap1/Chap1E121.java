import java.util.Arrays;
import java.lang.String;
/**
 * Exercises 1.2.1
 */
public class Chap1E121/*Point2D*/ {
        private double x;
        private double y;
        
        public Chap1E121(double px, double py)
        {
            x = px;
            y = py;
//            StdOut.println("init: " + x + " " + y);
        }
        
        public void DrawPoint()
        {
//            StdDraw.setPenColor(StdDraw.RED);
//            StdOut.println("drawPoint: " + x + " " + y);
            StdDraw.point(x, y);
        }

        public double Dist(Chap1E121 p)
        {
            return Math.sqrt((x-p.x)*(x-p.x)+(y-p.y)*(y-p.y));
        }

     public static void main(String[] args) {
        int T = Integer.parseInt(args[0]);
        double minDist = Double.MAX_VALUE;
        StdDraw.setPenRadius(0.05);
        StdDraw.setPenColor(StdDraw.BLUE);
        Chap1E121[] pq = new Chap1E121[T];
        for(int t = 0; t < T; t++)
        {
            Chap1E121 p = new Chap1E121(StdRandom.random(), StdRandom.random());
            p.DrawPoint();
            pq[t] = p;
        }
     
        for(int t = 0; t < T-1; t++)
        {
            for(int j = t+1; j < T; j++)
                minDist = Math.min(minDist, pq[t].Dist(pq[j]));
        }
        StdOut.println("min dist = " + minDist);
     }
}