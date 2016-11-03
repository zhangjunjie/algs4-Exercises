/**
 * Exercises 1.3.19
 */
import java.util.*;

public class Chap1E1319/*Delete*/ {
    static class Node{
        int item;
        Node next;
    }
    public static void delete(Node first)
    {
        if(first == null)
            return;
        Node dummy = new Node();
        dummy.next = first;
        Node cur = dummy;
        while(cur.next != null && cur.next.next != null) cur = cur.next;
        cur.next = null;
        return;
    }
    
    public static void main(String[] args) {
        Node first = new Node();
        first.item = 0;
        Node cur = first;

        for(int i = 1; i < 100; i++){
            Node tmp = new Node();
            tmp.item = i;
            cur.next = tmp;
            cur = cur.next;
        }
        delete(first);
        cur = first;
        while(cur != null){
            StdOut.printf(cur.item + " ");
            cur = cur.next;
        }
        
    }
}
