/**
 * Exercises 1.3.24
 */
import java.util.*;

public class Chap1E1324/*removeAfter*/ {
    static class Node{
        int item;
        Node next;
    }
    public static void removeAfter(Node first, Node target)
    {
        if(first == null || target == null)
            return;
        while(first != null){
            if(first == target){
                if(first.next != null)
                    first.next = first.next.next;
                return;
            }
            first = first.next;
        }
        return;
    }
    
    public static void main(String[] args) {
        Node first = new Node();
        first.item = 0;
        Node cur = first;
        Node target = first;
        int n = 10;
        for(int i = 1; i < n; i++){
            Node tmp = new Node();
            tmp.item = i;
            cur.next = tmp;
            cur = cur.next;
            if(i == 5)     target = cur;
        }
    
        removeAfter(first, target);
        
        cur = first;
        while(cur != null){
           StdOut.printf(cur.item + " ");
           cur = cur.next;
        }
        
    }
}
