/**
 * Exercises 1.3.21
 */
import java.util.*;

public class Chap1E1321/*find*/ {
    static class Node{
        int item;
        Node next;
    }
    public static boolean find(Node first, int target)
    {
        while(first != null){
            if(first.item == target) return true;
            first = first.next;
        }
        return false;
    }
    
    public static void main(String[] args) {
        Node first = new Node();
        first.item = 0;
        Node cur = first;
        int n = 10;
        for(int i = 1; i < n; i++){
            Node tmp = new Node();
            tmp.item = i;
            cur.next = tmp;
            cur = cur.next;
        }
        for(int i = n/2; i < n+5; i++){
            if(find(first, i)) StdOut.println("find " + i);
            else StdOut.println("can't find " + i);
        }
        
    }
}
