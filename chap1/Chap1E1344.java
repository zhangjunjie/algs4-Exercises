import java.util.NoSuchElementException;

//import edu.princeton.cs.introcs.StdOut;

public class Chap1E1344<Item> {
  Stack<Character> prev;
  Stack<Character> next;
    /**
     * Initializes two stacks.
     */
  Chap1E1344() {
      prev = new Stack<Character>();
      next = new Stack<Character>();
  }

  void insert(char c){
      prev.push(c);
  }
  char get(){
      if (prev.isEmpty()) throw new NoSuchElementException("Stack underflow");
      return prev.peek();
  }
  char delete(){
      if (prev.isEmpty()) throw new NoSuchElementException("Stack underflow");
      prev.pop();
      return prev.peek();
  }
  void left(int k){
      if (prev.size()<k) throw new NoSuchElementException("Stack underflow");
      while(k-->0){
          next.push(prev.peek());
          prev.pop();
      }
  }
  void right(int k){
      if (next.size()<k) throw new NoSuchElementException("Stack underflow");
      while(k-->0){
          prev.push(next.peek());
          next.pop();
      }
  }
  int size(){
      return prev.size() + next.size();
  }

 public boolean isEmpty() {
  return (prev == null) && (next == null);
 }

 public static void main(String[] args) {
  Chap1E1344 sq = new Chap1E1344();
  sq.insert('1');
  sq.insert('2');
  sq.insert('3');
  sq.insert('4');
  sq.left(2);
  StdOut.println(sq.get());
  sq.delete();
  StdOut.println(sq.get());
  sq.right(2);
  StdOut.println(sq.get());
  
 }

}