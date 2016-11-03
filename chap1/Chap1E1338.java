import java.util.Iterator;
import java.util.NoSuchElementException;

//import edu.princeton.cs.introcs.StdOut;

public class Chap1E1338<Item>{
    private int head, tail, item_size;
    private Item[] a;    
    
    /**
     * Initializes an empty queue.
     */
    public Chap1E1338(int cap) {
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
    public boolean isFull() {
        return item_size == a.length;
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

    int decIdx(int h){
        return (h-1 + a.length)%a.length;
    }
    /**
     * Adds the item to this queue.
     * @param item the item to add to this bag
     */
    public void insert(Item item) {
        if(item_size == a.length)
            resizeQueue(4*a.length);
        a[tail] = item;
        tail = incIdx(tail);
        item_size++;
    }
   public Item dequeue() {
        if (isEmpty()) throw new NoSuchElementException();
        
        Item item = a[head];
        head = incIdx(head);

        item_size--;
//        if(item_size < a.length/4)
//            resizeQueue(a.length/2);
        return item;
    }
   public Item delete(int k) {
        if (k > size() || k < 1) throw new NoSuchElementException();
        int del_idx;
        if(tail >= k)     del_idx = tail - k;
        else              del_idx = tail - k + a.length;
//        StdOut.println(" head=" + head + " tail = " + tail + " del_idx = " + del_idx + " k = " + k);
        Item item = a[del_idx];
        while(del_idx != decIdx(tail)){
                int tmp = incIdx(del_idx);
                a[del_idx] = a[tmp];
                del_idx = incIdx(del_idx);
        }
        tail = decIdx(tail);
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
        Chap1E1338<Integer> q = new Chap1E1338<Integer>(10);
        for(int i = 0; i < 8; i++){
            q.insert(i);
            StdOut.printf(" " + q.dequeue());
        }
        StdOut.println();
        for(int i = 0; i < 5; i++){
            q.insert(i);
        }
        StdOut.printf(" " + q.delete(5));
        StdOut.println();
        StdOut.println("size of q = " + q.size());
        
        while (!q.isEmpty() ) {
            StdOut.printf(" " + q.delete(1));
        }
    }

    
}
