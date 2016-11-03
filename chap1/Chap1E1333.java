import java.util.NoSuchElementException;

//import edu.princeton.cs.introcs.StdOut;

public class Chap1E1333<Item> {
 Node<Item> first;
 Node<Item> end;
 int item_number;
 public void pushLeft(Item item) {
  if (first == null) {
   first = new Node<Item>();
   first.item = item;
   if(end == null)
       end = first;
  } else {
   Node<Item> oldfirst = first;
   first = new Node<Item>();
   first.item = item;
   first.next = oldfirst;
   oldfirst.prev = first;
  }
 }

  public void pushRight(Item item) {
  if (end == null) {
   end = new Node<Item>();
   end.item = item;
   if(first == null)
       first = end;
  } else {
   Node<Item> oldend = end;
   end = new Node<Item>();
   end.item = item;
   end.prev = oldend;
   oldend.next = end;
  }
 }

 public Item popLeft() {
  if (isEmpty())
   throw new NoSuchElementException("Steque underflow");
  Item returnvalue = first.item;
  first = first.next;
  return returnvalue;
 }

 public Item popRight() {
  if (isEmpty())
   throw new NoSuchElementException("Steque underflow");
  Item returnvalue = end.item;
  end = end.prev;
  return returnvalue;
 }

 public boolean isEmpty() {
  return first == null;
 }

 private static class Node<Item> {
  Item item;
  Node<Item> prev;
  Node<Item> next;
 }

 public static void main(String[] args) {
  Chap1E1333<String> sq = new Chap1E1333<String>();
  sq.pushLeft("a1");
  sq.pushRight("a3");
  sq.pushLeft("a4");
  sq.pushRight("a2");

  StdOut.println(sq.popLeft());
  StdOut.println(sq.popRight());
  StdOut.println(sq.popLeft());
  StdOut.println(sq.popRight());
 }

}