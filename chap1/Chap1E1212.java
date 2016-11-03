/**
 * Exercises 1.2.12
 */
public class Chap1E1212 {
        private int day;
        private int month;
        private int year;
        private int dayOfWeek = 7;
        private int startWeek = 6;
        static int[] leap_year = {0,31,29,31,30,31,30,31,31,30,31,30,31};
        static int[] normal_year = {0,31,28,31,30,31,30,31,31,30,31,30,31};
        static String[] dateName = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
        
        public static int daysGap(Chap1E1212 date)
        {
            int days = 0;
            for(int i = 2000; i < date.year; i++)
            {
                if(isLeapYear(i))
                    days += 366;
                else
                    days +=365;
            }
            //add month
            if(isLeapYear(date))
            {
                for(int i = 1; i < date.month; i++)
                {
                   days += leap_year[i]; 
                }
            }else {
                for(int i = 1; i < date.month; i++)
                {
                   days += normal_year[i]; 
                }     
            }
            //add days
            days += date.day-1;
            return days;
        }

        public static boolean isLeapYear(int year)
        {
            if((year % 4 == 0 && year %100 != 0) || (year%400 == 0))
                return true;
            else
                return false;
        }
        public static boolean isLeapYear(Chap1E1212 date)
        {
            if((date.year % 4 == 0 && date.year %100 != 0) || (date.year%400 == 0))
                return true;
            else
                return false;
        }
        
        public static void CheckDate(Chap1E1212 date)
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
            Chap1E1212 date = new Chap1E1212();
            date.year = y;
            date.month = m;
            date.day = d;
            CheckDate(date);
            int dayGap = daysGap(date);
            String name = dateName[(dayGap + date.startWeek)%date.dayOfWeek];
            StdOut.println(date.year + " " + date.month + " " + date.day + " is " + name);
       }
}