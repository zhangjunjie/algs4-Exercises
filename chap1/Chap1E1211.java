/**
 * Exercises 1.2.11
 */
public class Chap1E1211 {
        private int day;
        private int month;
        private int year;
        static int[] leap_year = {0,31,29,31,30,31,30,31,31,30,31,30,31};
        static int[] normal_year = {0,31,28,31,30,31,30,31,31,30,31,30,31};
 
        public static boolean isLeapYear(Chap1E1211 date)
        {
            if((date.year % 4 == 0 && date.year %100 != 0) || (date.year%400 == 0))
                return true;
            else
                return false;
        }
        
        public static void CheckDate(Chap1E1211 date)
        {
            if(date.month < 1|| date.month > 12)
            {
                throw new RuntimeException("Error month.");
            }
            
            if(isLeapYear(date)){
            StdOut.println("It is a LEAP year.");
                if(date.day < 0 || date.day > leap_year[date.month])
                {
                     throw new RuntimeException("Error day");
                }
            }else{
            StdOut.println("It is a Normal year.");
                if(date.day < 0 || date.day > normal_year[date.month])
                {
                     throw new RuntimeException("Error day");
                }    
            }
            StdOut.println("It is a valid date");
        }
        
       public static void main(String[] args) {
          
//           Chap1E1211 date = new Chap1E1211();
           int m = Integer.parseInt(args[0]);
           int d = Integer.parseInt(args[1]);
           int y = Integer.parseInt(args[2]);
            Chap1E1211 date = new Chap1E1211();
            date.year = y;
            date.month = m;
            date.day = d;
            CheckDate(date);
           
       }
}