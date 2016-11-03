/**
 * Exercises 1.2.13
 */
public class Chap1E1213/*Transaction*/ {
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
        }
       public static void main(String[] args) {
          
//           Chap1E1211 date = new Chap1E1211();
           String n = args[0];
           int m = Integer.parseInt(args[1]);
           int d = Integer.parseInt(args[2]);
           int y = Integer.parseInt(args[3]);
           int c = Integer.parseInt(args[4]);
           
            Chap1E1213 T = new Chap1E1213();
            T.customer = new Customer(n);
            T.date = new Date(m, d, y);
            T.amount = new Amount(c);
            StdOut.println(T.customer + " buy " + T.amount + " on " + T.date);
       }
}