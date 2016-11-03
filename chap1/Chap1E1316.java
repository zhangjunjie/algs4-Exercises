/**
 * Exercises 1.3.16
 */
import java.util.*;

public class Chap1E1316/*Parse Date*/ {
    static class Date{
        private int month, day, year;
        
        public Date(String date){
            String[] fields = date.split("/");
            month = Integer.parseInt(fields[0]);
            day = Integer.parseInt(fields[1]);
            year = Integer.parseInt(fields[2]);
        }
        public boolean isEmpty(){
            return this.month == 0 || this.day == 0 || this.year == 0;
        }
    }
    public static Date[] readDates(String name)
    {
        Date date = new Date(name);
        StdOut.println(date.month + "/" + date.day + "/" + date.year);
        Queue<Date> q = new LinkedList<Date>();
        if(!date.isEmpty())
            q.add(date);
        int N = q.size();
        Date[] a = new Date[N];
        for(int i = 0; i < N; i++)
            a[i] = q.remove();
        return a;
    }
    
    public static void main(String[] args) {
        Date[] dates = new Date[1];
        while (!StdIn.isEmpty()) {
            String item = StdIn.readString();
            StdOut.println("item = " + item);
            dates = readDates(item);
        }
        
        
        StdOut.println(dates[0].month + "/" + dates[0].day + "/" + dates[0].year);
        
    }
}
