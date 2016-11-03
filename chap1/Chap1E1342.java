import java.util.NoSuchElementException;

//import edu.princeton.cs.introcs.StdOut;

public class Chap1E1342<Item> {
 Node<Item> first;
    /**
     * Initializes an empty queue.
     */
    public Chap1E1342() {
        first = null;
    }
    /**
     * Initializes an empty queue with another queue
     */
    public Chap1E1342(Chap1E1342<Item> s) {
        first = null;
        Chap1E1342<Item> tmp = new Chap1E1342<Item>();
        while(!s.isEmpty()){
            tmp.push(s.pop());
        }
        while(!tmp.isEmpty()){
            Item tmp_item = tmp.pop();
            push(tmp_item);
            s.push(tmp_item);
        }
        
    }
 public void push(Item item) {
  if (first == null) {
   first = new Node<Item>();
   first.item = item;
  } else {
   Node<Item> oldfirst = first;
   first = new Node<Item>();
   first.item = item;
   first.next = oldfirst;
  }
 }

 public Item pop() {
  if (isEmpty())
   throw new NoSuchElementException("Steque underflow");
  Item returnvalue = first.item;
  first = first.next;
  return returnvalue;
 }

 public boolean isEmpty() {
  return first == null;
 }

 private static class Node<Item> {
  Item item;
  Node<Item> next;
 }

 public static void main(String[] args) {
  Chap1E1342<String> sq = new Chap1E1342<String>();
  sq.push("a1");
  sq.push("a2");
  Chap1E1342<String> t = new Chap1E1342<String>(sq);

  StdOut.println(sq.pop());
  StdOut.println(sq.pop());
  StdOut.println(t.pop());
  StdOut.println(t.pop());
 
 }

}