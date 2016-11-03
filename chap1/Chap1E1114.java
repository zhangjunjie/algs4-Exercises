//import java.util.Arrays;
//import java.util.Scanner;
/**
 * Exercises 1.1.14
 */
public class Chap1E1114 {
    static int lg(int num, int base)
    {
        int ret = 0;
        while(num >= base)
        {
            num /= base;
            ret++;
        }
        return ret;
    }
    
    public static void main(String[] args) {
        int base = 2, num, ret;
        num = Integer.parseInt(args[0]);
        ret = lg(num, base);
        StdOut.println(Integer.toString(ret));
        ret = (int)(Math.log(num)/Math.log(2));
        StdOut.println(Integer.toString(ret));
    }
}