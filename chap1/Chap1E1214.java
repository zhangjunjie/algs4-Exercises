/**
 * Exercises 1.2.14
 */
public class Chap1E1214/*Transaction*/ {
        private Date date;
        private Customer customer;
        private Amount amount;
        static public class Date
        {
            private final int month;
            private final int day;
            private final int year;
            public Date(int m, int d, int y)
            { month = m; day = d; year = y;}
            
            public int month()
            { return month; }
            
            public int day()
            { return day; }
            
            public int year()
            { return year; }
            
            public String toString()
            { return month() + "/" + day() + "/" + year(); }
            
            public boolean equals(Object x)
            {
                StdOut.println(" Date equals start.");
                if( this == x) return true;
                if( x == null) return false;
                if(this.getClass() != x.getClass()) return false;
                Date that = (Date) x;
                if(this.day != that.day) return false;
                if(this.month != that.month) return false;
                if(this.year != that.year) return false;
                StdOut.println(" Date equals end.");
                return true;
            }
        }
        static public class Customer
        {
            private final String name;
            public Customer(String n)
            { name = n; }
            
            public String name()
            { return name; }
            
            public String toString()
            { return name; }

            public boolean equals(Object x)
            {
                StdOut.println(" Customer equals start.");
                if( this == x) return true;
                if( x == null) return false;
                if(this.getClass() != x.getClass()) return false;
                Customer that = (Customer) x;
                if(this.name != that.name) return false;
                StdOut.println(" Customer equals end.");
                return true;
            }
        }
        
        static public class Amount
        {
            private int amount;

            public Amount(int c)
            { amount = c; }
            public int amount()
            { return amount; }
            public String toString()
            { return String.valueOf(amount); }

            public boolean equals(Object x)
            {
                StdOut.println(" Amount equals start.");
                if( this == x) return true;
                if( x == null) return false;
                if(this.getClass() != x.getClass()) return false;
                Amount that = (Amount) x;
                if(this.amount != that.amount) return false;
                StdOut.println(" Amount equals end.");
                return true;
            }
        }
       public static void main(String[] args) {
          
//           Chap1E1211 date = new Chap1E1211();
            //customer 1
           String n = args[0];
           int m = Integer.parseInt(args[1]);
           int d = Integer.parseInt(args[2]);
           int y = Integer.parseInt(args[3]);
           int c = Integer.parseInt(args[4]);
           
            Chap1E1214 T = new Chap1E1214();
            T.customer = new Customer(n);
            T.date = new Date(m, d, y);
            T.amount = new Amount(c);
            StdOut.println(T.customer + " buy " + T.amount + " on " + T.date);
            //customer 2
            n = args[5];
            m = Integer.parseInt(args[6]);
            d = Integer.parseInt(args[7]);
            y = Integer.parseInt(args[8]);
            c = Integer.parseInt(args[9]);
           
            Chap1E1214 T1 = new Chap1E1214();
            T1.customer = new Customer(n);
            T1.date = new Date(m, d, y);
            T1.amount = new Amount(c);
            StdOut.println(T1.customer + " buy " + T1.amount + " on " + T1.date);

            if(T==T1)
                StdOut.println(" T == T1 ");
            else
                StdOut.println(" T != T1");

       }
}