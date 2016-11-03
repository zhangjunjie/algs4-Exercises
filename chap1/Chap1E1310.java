/**
 * Exercises 1.3.10
 */
import java.util.*;
public class Chap1E1310 /*InfixToPostfix*/ {
    public static void main(String[] args)
    {
        Stack<String> stack  = new Stack<String>();
   
        while (!StdIn.isEmpty()) {
            String s = StdIn.readString();
            if (s.equals("+"))    stack.push(s);
            else if (s.equals("-"))    stack.push(s);
            else if (s.equals("*"))    stack.push(s);
            else if (s.equals("/"))    stack.push(s);
            else if (s.equals(")"))    StdOut.print(stack.pop()+ " ");
            else if (s.equals("("))    StdOut.print("");
            else                       StdOut.print(s + " ");
        }
    }
}
