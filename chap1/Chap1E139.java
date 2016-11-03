/**
 * Exercises 1.3.9 based on Evaluate.java
 */
import java.util.*;
public class Chap1E139 /*Evaluate*/ {
    public static void main(String[] args) {
        Stack<String> ops  = new Stack<String>();
        Stack<String> vals  = new Stack<String>();

        while (!StdIn.isEmpty()) {
            String s = StdIn.readString();
            if      (s.equals("("))               ;
            else if (s.equals("+"))    ops.push(s);
            else if (s.equals("-"))    ops.push(s);
            else if (s.equals("*"))    ops.push(s);
            else if (s.equals("/"))    ops.push(s);
            else if (s.equals("sqrt")) ops.push(s);
            else if (s.equals(")")) {
                String v;
                String op = ops.pop();
                String v1 = vals.pop();
                String v2 = vals.pop();
                v = "( " + v2 + " " + op + " " + v1 + " ) ";
                vals.push(v);
            }
            else vals.push(s);
        }
        StdOut.println(vals.pop());
    }
}
