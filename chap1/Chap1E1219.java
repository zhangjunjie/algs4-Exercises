/**
 * Exercises 1.2.19
 */
import java.util.ArrayList;

public class Chap1E1219 {
    private String str;
    private int month;
    private int day;
    private int year;
    // do bounds-checking to ensure object represents a valid date
    public Chap1E1219(String s) {
        str = s;
        String[] fields = s.split("/");
        month = Integer.parseInt(fields[0]);
        day = Integer.parseInt(fields[1]);
        year = Integer.parseInt(fields[2]);
        StdOut.printf("m=%d d=%d y=%d\n", month, day, year);
    }
    
    public String[] split(String s)
    {
        int s_idx = 0, e_idx = 0;
        ArrayList<String> where = new ArrayList<String>();

        while(e_idx != -1)
        {
            e_idx = this.str.indexOf(s, s_idx);
            if(e_idx != -1)
                where.add(this.str.substring(s_idx, e_idx));
            s_idx = e_idx;
         }
         where.add(this.str.substring(s_idx, this.str.length()));
         
         String[] ret = new String[ where.size() ];
         where.toArray( ret );
         return ret;
    }
     public static void main(String[] args) {
        String date = args[0];
        Chap1E1219 d = new Chap1E1219(date);
     }
}