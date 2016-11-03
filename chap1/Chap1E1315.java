/**
 * Exercises 1.3.15
 */
import java.util.*;

public class Chap1E1315/*kth from the last*/ {
    public static void main(String[] args) {
        int k = Integer.parseInt(args[0]);
        int item_number = 0;
        Queue<String> q = new LinkedList<String>();
        //Queue queue = new LinkedList();
        while (!StdIn.isEmpty()) {
            String item = StdIn.readString();
            q.add(item);
            item_number++;
        }
        int diff = item_number - k;
        while(diff-->0){
            q.remove();   
        }
        StdOut.print(q.remove() + " ");
    }
}
