//import java.util.Arrays;
//import java.util.Scanner;
/**
 * Exercises 1.1.18
 */
public class Chap1E1118 {
    public static int mystery(int a, int b)
    {
        if(b == 0) return 0;
        if(b%2 == 0) return mystery(a+a, b/2);
        return mystery(a+a, b/2)+a;
    }

    public static int mysteryp(int a, int b)
    {
        if(b == 0) return 1;
        if(b%2 == 0) return mysteryp(a*a, b/2);
        return mysteryp(a*a, b/2)*a;
    }

    public static void main(String[] args) {
        int a = 3, b = 11, ret;
        ret = mystery(a,b);
        StdOut.println(Integer.toString(ret));
        ret = mysteryp(a,b);
        StdOut.println(Integer.toString(ret));
    }
}