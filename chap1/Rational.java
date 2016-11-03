/**
 * Exercises 1.2.16
 */
public class Rational/*Chap1E1216*/ {
        private int numerator;
        private int denominator;
        private int sign;
        
        static int gcd(int x, int y)
        {
            if(x == 0)
                return y;
            return gcd( y % x, x);
        }
        
        public Rational(int n, int d)
        {
            if(n < 0)
            {
                sign = -1;
                n *= -1;
            }else{
                sign = 1;
            }
            int g = gcd(n, d);
//            StdOut.printf("%d %d %d\n", n, d, g);
            numerator = n/g;
            denominator = d/g;
        }

        public Rational plus(Rational b)
        {
            int a = this.numerator*b.denominator;
            int c = this.denominator*b.numerator;
            int new_n = a;
            if(this.sign == b.sign || (this.sign > 0 && b.sign < 0))
            {
                new_n = a+c;
            }else if(sign < 0 && b.sign > 0){
                new_n = Math.abs(a-c);
            }
            int new_d = this.denominator*b.denominator;
            int g = gcd(new_n, new_d);
            this.numerator = new_n/g;
            this.denominator = new_d/g;
            return this;
        }

        public Rational minus(Rational b)
        {
            int a = this.numerator*b.denominator;
            int c = this.denominator*b.numerator;
            StdOut.printf("%d %d \n", a, c);
            int new_n = a;
            if((this.sign > 0 && b.sign < 0) || (this.sign < 0 && b.sign > 0))
            {
                new_n = a+c;
            }else if(sign == -1 && b.sign == -1){
                new_n = Math.abs(a-c);
                if(c >= a)
                {
                  this.sign = 1;
                }else{
                    this.sign = -1;
                }
            }else if(sign == 1 && b.sign == 1){
                new_n = Math.abs(a-c);
                if(c > a)
                {
                  this.sign = -1;
                }else{
                    this.sign = 1;
                }
            }
            int new_d = this.denominator*b.denominator;
            int g = gcd(new_n, new_d);
            this.numerator = new_n/g;
            this.denominator = new_d/g;
            return this;
        }
        
        public Rational times(Rational b)
        {
            int a = this.numerator*b.numerator;
            int c = this.denominator*b.denominator;
            if(this.sign != b.sign)
            {
                this.sign = -1;
            }else{
                this.sign = 1;
            }
            int g = gcd(a, c);
            this.numerator = a/g;
            this.denominator = c/g;
            return this;
        }

        public Rational dividedBy(Rational b)
        {
            int a = this.numerator*b.denominator;
            int c = this.denominator*b.numerator;
            if(this.sign != b.sign)
            {
                this.sign = -1;
            }else{
                this.sign = 1;
            }
            int g = gcd(a, c);
            this.numerator = a/g;
            this.denominator = c/g;
            return this;
        }
        
        public boolean equals(Rational b)
        {
            if(this.sign != b.sign)
            {
                return false;
            }
            
            int g = gcd(b.numerator, b.denominator);
            if(this.numerator != b.numerator/g)
                return false;
            if(this.denominator != b.denominator/g)
                return false;
            return true;
        }
        public String toString()
        {
            return String.valueOf(sign) +" "+ String.valueOf(this.numerator) +"/" + String.valueOf(this.denominator);
        }
       public static void main(String[] args) {
           int n = Integer.parseInt(args[0]);
           int d = Integer.parseInt(args[1]);
           Rational r = new Rational(n, d);
           StdOut.println(r);
           r.minus(new Rational(1,2));
           StdOut.println(r);
           StdOut.println(r.equals(r));
       }
}