/**
 * Exercises 1.3.4
 */
import java.util.*;
public class Chap1E134 /*Stack*/ {
    static boolean checkPar(String s)
    {
        Stack<Character> par = new Stack<Character>();
        
        for(int i = 0; i < s.length(); i++)
        {
            char c = s.charAt(i);

            if(c=='[')      par.push(c);
            else if(c=='(') par.push(c);
            else if(c=='{') par.push(c);
            else if(c==']'){
                    if(par.empty()) return false;
                    char t = par.pop();
                    if(t!='[')  return false;
            }else if(c==')'){
                    if(par.empty()) return false;
                    char t = par.pop();
                    if(t != '(')  return false;
            }else if(c=='}'){
                    if(par.empty()) return false;
                    char t = par.pop();
                    if(t!='{')  return false;
            }
         }
         return true;
      }
    
        public static void main(String[] args) {
            String s = args[0];
            boolean ret = checkPar(s);
            StdOut.println(ret+"");
    }
}