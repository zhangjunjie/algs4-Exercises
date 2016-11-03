import java.util.NoSuchElementException;

//import edu.princeton.cs.introcs.StdOut;

public class Chap1E1347<Item> {
 Node<Item> first, last;
 public void catenate(Chap1E1347 c){
     this.last.next = c.first;
     this.last = c.last;
 }
 
 public void push(Item item) {
  if (first == null) {
   first = new Node<Item>();
   first.item = item;
   last = first;
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

 public void enqueue(Item item) {
  if (first == null) {
   first = new Node<Item>();
   first.item = item;
   last = first;
  } else {
   Node<Item> current = first;
   Node<Item> next = first.next;
   while (next != null) {
    current = next;
    next = next.next;
   }
   next = new Node<Item>();
   next.item = item;
   current.next = next;
   last = next;
  }
 }

 public boolean isEmpty() {
  return first == null;
 }

 private static class Node<Item> {
  Item item;
  Node<Item> next;
 }

 public static void main(String[] args) {
  Chap1E1347<String> sq = new Chap1E1347<String>();
  Chap1E1347<String> sq1 = new Chap1E1347<String>();
  sq.push("a1");
  sq.enqueue("a3");
  sq.enqueue("a4");
  sq.push("a2");

  sq1.push("a5");
  sq1.enqueue("a6");
  sq1.enqueue("a7");
  sq1.push("a8");
  sq.catenate(sq1);
  while(!sq.isEmpty()){
    StdOut.printf(sq.pop() + " ");
  }
 }
}