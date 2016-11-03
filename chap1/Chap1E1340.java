import java.util.*;


//import edu.princeton.cs.introcs.StdOut;

public class Chap1E1340<Item>{
    private Node<Item> first;    // beginning of queue
    private int n;               // number of elements on queue

    // helper linked list class
    private static class Node<Item> {
        private Item item;
        private Node<Item> next;
    }

    /**
     * Initializes an empty queue.
     */
    public Chap1E1340() {
        first = null;
        n = 0;
    }

    /**
     * Returns true if this queue is empty.
     *
     * @return <tt>true</tt> if this queue is empty; <tt>false</tt> otherwise
     */
    public boolean isEmpty() {
        return first == null;
    }

    /**
     * Returns the number of items in this queue.
     *
     * @return the number of items in this queue
     */
    public int size() {
        return n;
    }

    /**
     * Returns the item least recently added to this queue.
     *
     * @return the item least recently added to this queue
     * @throws NoSuchElementException if this queue is empty
     */
    public Item peek() {
        if (isEmpty()) throw new NoSuchElementException("Queue underflow");
        return first.item;
    }
    
    public void removeDup(Item item){
        Node<Item> pre = new Node<Item>(), dummy =  new Node<Item>();
        dummy.next = first;
        pre.next = first;
        while(first != null && first.item != item){
            first = first.next;
            pre = pre.next;
        }
        
        if(first == dummy.next){
            first = first.next;
        }else if(first != null){
            pre.next = first.next;
            first = null;
            first = dummy.next;
        }else{
            first = dummy.next;
        }
//        StdOut.printf("first.item = " + peek());
//        first = dummy.next;
//        StdOut.printf("first.item = " + peek());
        return;
    }
        
    /**
     * Adds the item to this queue.
     *
     * @param  item the item to add
     */
    public void insert(Item item) {
        if (isEmpty()){
            first = new Node<Item>();
            first.item = item;
            return;
        }
        removeDup(item);
        Node<Item> new_first = new Node<Item>();
        new_first.item = item;
        new_first.next = first;
        first = new_first;
        n++;
    }
    /**
     * Removes and returns the item on this queue that was least recently added.
     *
     * @return the item on this queue that was least recently added
     * @throws NoSuchElementException if this queue is empty
     */
    public Item dequeue() {
        if (isEmpty()) throw new NoSuchElementException("Queue underflow");
        Item item = first.item;
        first = first.next;
        n--;
        if (isEmpty()) first = null;   // to avoid loitering
        return item;
    }
    public static void main(String[] args) {
       int M = Integer.parseInt(args[0]);
       int N = Integer.parseInt(args[1]);
       
       Chap1E1340<Integer> queue = new Chap1E1340<Integer>();
       for(int i = 0; i < N; i++)
           queue.insert(i);
       for(int i = M-1; i >=0; i--)
           queue.insert(i);
       while(!queue.isEmpty()){
           StdOut.printf(" " + queue.dequeue());
       }
       StdOut.println();
    }

    
}