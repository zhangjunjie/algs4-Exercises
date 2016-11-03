import java.util.NoSuchElementException;

//import edu.princeton.cs.introcs.StdOut;

public class Chap1E1345<Item> {
 public static void main(String[] args) {
   int N = Integer.parseInt(args[0]);
   boolean val = true;
   int[] data = {3,1,5,4,2,0};
   for(int i = 0; i < N-2; i++){
       if(data[i+1] < data[i+2] && data[i+2] < data[i]){
           val = false; break;
       }
   }
   if(val == true)       StdOut.println("Valid per");
   else          StdOut.println("Invalid per");
 }
}