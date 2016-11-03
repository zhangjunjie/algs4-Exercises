/**
 * Exercises 1.3.25
 */


public class Chap1E1325/*insertAfter*/ {
    static class Node{
        int item;
        Node next;
    }
    static Node first;
    public static void insertAfter(Node n1, Node n2)
    {
        if(n1 == null || n2 == null)
            return;
        Node cur = first;
        while(cur != null){
            if(cur == n1){
                Node tmp = cur.next;
                cur.next = n2;
                n2.next = tmp;
                return;
            }
            cur = cur.next;
        }
        return;
    }
    
    public static void main(String[] args) {
        first = new Node();
        first.item = 0;
        Node cur = first;
        Node target = first;
        int n = 10;
        for(int i = 1; i < n; i++){
            Node tmp = new Node();
            tmp.item = i;
            cur.next = tmp;
            cur = cur.next;
            if(i == 9)     target = cur;
        }
        Node n2 = new Node();
        n2.item = 100;
        insertAfter(target, n2);
        
        cur = first;
        while(cur != null){
           StdOut.printf(cur.item + " ");
           cur = cur.next;
        }
        
    }
}
