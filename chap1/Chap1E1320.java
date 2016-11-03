/**
 * Exercises 1.3.20
 */
import java.util.*;

public class Chap1E1320/*Delete*/ {
    static class Node{
        int item;
        Node next;
    }
    public static void delete(Node first, int k)
    {
        if(first == null)
            return;
        Node dummy = new Node();
        dummy.next = first;
        Node cur = first;
        Node prv = dummy;
        //find the kth node
        while(--k > 0 && cur != null){
            cur = cur.next;
            prv = prv.next;
        }
        if(k == 0)
            prv.next = cur.next;
        first = dummy.next;
        return;
    }
    
    public static void main(String[] args) {
        Node first = new Node();
        first.item = 0;
        Node cur = first;
        int n = 20;
        for(int i = 1; i < n; i++){
            Node tmp = new Node();
            tmp.item = i;
            cur.next = tmp;
            cur = cur.next;
        }
        delete(first, n+22);
        cur = first;
        while(cur != null){
            StdOut.printf(cur.item + " ");
            cur = cur.next;
        }
        
    }
}
