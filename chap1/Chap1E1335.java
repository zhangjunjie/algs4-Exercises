import java.util.Iterator;
import java.util.NoSuchElementException;

//import edu.princeton.cs.introcs.StdOut;

public class Chap1E1335<Item>{
    private int head, tail, item_size;
    private Item[] a;    
    
    /**
     * Initializes an empty queue.
     */
    public Chap1E1335(int cap) {
        a = (Item[]) new Object[cap];
        item_size = 0;
        head = 0;
        tail = 0;
    }

    /**
     * Is this queue empty?
     * @return true if this bag is empty; false otherwise
     */
    public boolean isEmpty() {
        return item_size == 0;
    }
    public void resizeQueue(int new_size){
        Item[] tmp;
        tmp = (Item[]) new Object[new_size];
        int k = item_size, i = 0, len = a.length;
        while(k-->0){
            tmp[i++] = a[(head + len)%len];
            head++;
        }
        head = 0;
        tail = item_size;
        a = tmp;
    }
    /**
     * Returns the number of items in this bag.
     * @return the number of items in this bag
     */
    public int size() {
        return item_size;
    }

    int incIdx(int h){
        return (h+1)%a.length;
    }
    /**
     * Adds the item to this queue.
     * @param item the item to add to this bag
     */
    public void enqueue(Item item) {
        if(item_size == a.length)
            resizeQueue(4*a.length);
        a[tail] = item;
        tail = incIdx(tail);
        item_size++;
    }

   public Item dequeue() {
        if (isEmpty()) throw new NoSuchElementException();
        int random = StdRandom.uniform(item_size);
        random = (random + head)%a.length;
        Item item = a[random];
        int r = (head + a.length)%a.length;
        a[random] = a[r];
        a[ r ] = null;
        head = incIdx(head);

        item_size--;
        if(item_size < a.length/4)
            resizeQueue(a.length/2);
        return item;
    }

   public Item sample() {
        int random = StdRandom.uniform(item_size);
        random = (random + head)%a.length;
        Item item = a[random];
        return item;
    }

   public static void main(String[] args) {
        Chap1E1335<Integer> q = new Chap1E1335<Integer>(5);
        for(int i = 0; i < 10; i++){
            q.enqueue(i);
        }

        for(int i = 0; i < 5; i++){
             StdOut.printf(" " + q.sample());
        }
        
        for(int i = 11; i < 20; i++){
            q.enqueue(i);
        }

        StdOut.println();
        StdOut.println("size of q = " + q.size());
         StdOut.println("- Random dequeue -");
        
        while (!q.isEmpty() ) {
            StdOut.printf(" " + q.dequeue());
        }
    }

    
}