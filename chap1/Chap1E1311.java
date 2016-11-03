/**
 * Exercises 1.3.11
 */
import java.util.*;
public class Chap1E1311 /*EvaluatePostfix*/ {
    public static void main(String[] args)
    {
        Stack<Double> ops = new Stack<Double>();
        double op1, op2;
        while (!StdIn.isEmpty()) {
            String s = StdIn.readString();
            if (s.equals("+")){ op2 = ops.pop(); op1 = ops.pop(); op1 += op2; ops.push(op1);}
            else if (s.equals("-"))    { op2 = ops.pop(); op1 = ops.pop(); op1 -= op2; ops.push(op1);}
            else if (s.equals("*"))    { op2 = ops.pop(); op1 = ops.pop(); op1 *= op2; ops.push(op1);}
            else if (s.equals("/"))    { op2 = ops.pop(); op1 = ops.pop(); op1 /= op2; ops.push(op1);}
            else ops.push(Double.parseDouble(s));
        }
        StdOut.println(ops.pop()+"");
    }
}
