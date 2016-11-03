/**
 * Exercises 1.3.12
 */
import java.util.Iterator;
import java.util.NoSuchElementException;
public class Chap1E1312<Item> implements Iterable<Item>  /*Iterator Stack*/{
    private Node<Item> first;     // top of stack
    private int n;                // size of the stack

    // helper linked list class
    private static class Node<Item> {
        private Item item;
        private Node<Item> next;
    }

     public Chap1E1312() {
         first = null;
         n = 0;
     }
     
     public boolean isEmpty() {
         return n == 0;
     }
     
     public int size() {
         return n;
     }
     
     public void push(Item item) {
         Node<Item> tmp = new Node<Item>();
         tmp.item = item;
         tmp.next = first;
         first = tmp;
         n++;
         return;
     }
     
     public Item pop() {
         if (isEmpty()) throw new NoSuchElementException("Stack underflow");
         Item ret = first.item;
         first = first.next;
         n--;
         return ret;
     }
     
     public Item peek() {
         if (isEmpty()) throw new NoSuchElementException("Stack underflow");
         return first.item;
     }
     
     public String toString() {
         StringBuilder ret = new StringBuilder();
         for(Item item:this)
             ret.append(item+"");
         return ret.toString();
     }
     
     public Iterator<Item> iterator() {
        return new ListIterator<Item>(first);
     }
     
     private class ListIterator<Item> implements Iterator<Item> {
         private Node<Item> current;
         public ListIterator(Node<Item> first){
             current = first;
         }
         
         public boolean hasNext(){
             return current != null;
         }
         
         public void remove(){
             throw new UnsupportedOperationException();
         }
         
         public Item next(){
             if(!hasNext()) throw new NoSuchElementException("Stack underflow");
             Item ret = current.item;
             current = current.next;
             return ret;
         }
     }
     
     static Chap1E1312<String> copy(Chap1E1312<String> s){
         Chap1E1312<String> ret = new Chap1E1312<String>();
         Iterator<String> i = s.iterator();
         if(s.isEmpty()) return ret;

         while(i.hasNext()){
             String s1 = i.next();;
             ret.push(s1);
         }
         return ret;
     }
     
     public static void main(String[] args) {
        Chap1E1312<String> stack = new Chap1E1312<String>();
        while (!StdIn.isEmpty()) {
            String item = StdIn.readString();
            if (!item.equals("-"))
                stack.push(item);
            else if (!stack.isEmpty())
                StdOut.print(stack.pop() + " ");
        }
        StdOut.println("(" + stack.size() + " left on stack)");
        Chap1E1312<String> ret;
        ret=copy(stack);
         for(String tmp:ret)
             StdOut.println(tmp);
        StdOut.println("(" + ret.size() + " left on stack)");
    }
}
