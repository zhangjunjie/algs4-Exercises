import java.util.NoSuchElementException;

//import edu.princeton.cs.introcs.StdOut;

public class Chap1E1348<Item> {
 Node<Item> first;
 Node<Item> l_base;
 Node<Item> r_base;
 Node<Item> end;
 int item_number;
 
 public void pushLeft(Item item) {
  if (first == null) {
   first = new Node<Item>();
   first.item = item;
   if(l_base == null)
       l_base = first;
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
   if(r_base == null)
       r_base = end;
  } else {
   Node<Item> oldend = end;
   end = new Node<Item>();
   end.item = item;
   end.prev = oldend;
   oldend.next = end;
  }
 }

 public Item popLeft() {
  if (LisEmpty())
   throw new NoSuchElementException("Steque underflow");
  Item returnvalue = first.item;
  first = first.next;
  return returnvalue;
 }

 public Item popRight() {
  if (RisEmpty())
   throw new NoSuchElementException("Steque underflow");
  Item returnvalue = end.item;
  end = end.prev;
  return returnvalue;
 }

 public boolean LisEmpty() {
  return l_base == null;
 }

 public boolean RisEmpty() {
  return r_base == null;
 }

 private static class Node<Item> {
  Item item;
  Node<Item> prev;
  Node<Item> next;
 }

 public static void main(String[] args) {
  Chap1E1348<String> sq = new Chap1E1348<String>();
  sq.pushLeft("a1");
  sq.pushRight("a3");
  sq.pushLeft("a4");
  sq.pushRight("a2");

  StdOut.println(sq.popLeft());
  StdOut.println(sq.popRight());
  StdOut.println(sq.popLeft());
//  StdOut.println(sq.popLeft());
  StdOut.println(sq.popRight());
 }

}