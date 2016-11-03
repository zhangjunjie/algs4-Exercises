/**
 * Exercises 1.2.18
 */
public class Chap1E1218/*Accumulator*/ {
        private int N=0;
        private double m=0;
        private double s=0;
        
        public Chap1E1218(){
        }
        
        public void addDataValue(double x)
        {
            N++;
            double delta = x - m;
            m += delta/N;
            s += (double)(N-1)/N*delta*delta;
        }
        public double mean()
        {
            return m;
        }
        
        public double var()
        {
            return s/(N-1);
        }
        public double stddev()
        {
            return Math.sqrt(this.var());
        }
        public int count(){
            return N;
        }
        
        public static void main(String[] args) {
        Chap1E1218 stats = new Chap1E1218();
        while (!StdIn.isEmpty()) {
            double x = StdIn.readDouble();
            StdOut.printf("%f ", x);
            stats.addDataValue(x);
        }

        StdOut.printf("N      = %d\n",   stats.count());
        StdOut.printf("mean   = %.5f\n", stats.mean());
        StdOut.printf("stddev = %.5f\n", stats.stddev());
        StdOut.printf("var    = %.5f\n", stats.var());
    }
}