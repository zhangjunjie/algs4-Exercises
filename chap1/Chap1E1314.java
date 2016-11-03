/**
 * Exercises 1.3.14
 */

import java.util.NoSuchElementException;
public class Chap1E1314/*ResizingArrayQueueOfStrings*/ {
    private String[] arr;     // string array
    private int n;                // size of the queue
    private int head, tail;      //pointer to head and tail
    private int item_number;        //number of items in the queue
    public Chap1E1314(int capability){
        arr = new String[capability];
        n = capability;
        head = 0;
        tail = 0;
        item_number = 0;
    }
    private void resize(int max){
        String[] tmp = new String[max];
        StdOut.println("resize to " + max + " item_number = " + item_number);
        for(int i = 0; i < item_number; i++){
            tmp[i] = arr[head];
            head = (head + 1) % n;
        }
        n = max;
        head = 0;
        tail = item_number;
        arr = tmp;
    }
    
    public void push(String s){
        //extent array
        if(item_number == n){
            resize( 2*n);
        }
        arr[tail] = s;
        tail = (tail+1)%n;
        item_number++;
        
    }
    
    public String pop(){
        if(item_number == 0) throw new NoSuchElementException("Queue empty");
        String ret = arr[head++];
        head %= n;
        item_number--;
        if(item_number > 0 && item_number == n/4) resize(n/2);
        return ret;
    }

    public boolean isEmpty(){
        return item_number == 0;
    }
    
    public static void main(String[] args) {
        Chap1E1314 queue = new Chap1E1314(5);
        while (!StdIn.isEmpty()) {
            String item = StdIn.readString();
            if (!item.equals("-"))
                queue.push(item);
            else if (!queue.isEmpty())
                StdOut.print(queue.pop() + " ");
        }
    }
}
