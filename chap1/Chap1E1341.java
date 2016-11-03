import java.util.*;


//import edu.princeton.cs.introcs.StdOut;

public class Chap1E1341<Item>{
    private Node<Item> first;    // beginning of queue
    private Node<Item> last;     // end of queue
    private int n;               // number of elements on queue

    // helper linked list class
    private static class Node<Item> {
        private Item item;
        private Node<Item> next;
    }

    /**
     * Initializes an empty queue.
     */
    public Chap1E1341() {
        first = null;
        last  = null;
        n = 0;
    }
    /**
     * Initializes an empty queue with another queue
     */
    public Chap1E1341(Chap1E1341<Item> q) {
        first = null;
        last  = null;
        n = q.n;
        int size = n;
        while(size-->0){
            Item tmp = q.dequeue();
            q.enqueue(tmp);
            enqueue(tmp);
        }
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

    /**
     * Adds the item to this queue.
     *
     * @param  item the item to add
     */
    public void enqueue(Item item) {
        Node<Item> oldlast = last;
        last = new Node<Item>();
        last.item = item;
        last.next = null;
        if (isEmpty()) first = last;
        else           oldlast.next = last;
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
        if (isEmpty()) last = null;   // to avoid loitering
        return item;
    }

   public static void main(String[] args) {
       int N = Integer.parseInt(args[0]);
      
       Chap1E1341<Integer> queue = new Chap1E1341<Integer>();
       for(int i = 0; i < N; i++)
           queue.enqueue(i);
       Chap1E1341<Integer> r = new Chap1E1341<Integer>(queue);
       
       while(!queue.isEmpty()){
           StdOut.printf(" " + queue.dequeue());
       }
       StdOut.println();
       
       while(!r.isEmpty()){
           StdOut.printf(" " + r.dequeue());
       }
       StdOut.println();
    }

    
}