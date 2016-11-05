public class Example
{
  public static void sort(Comparable[] a)
  { //ShellSort
    int N = a.length, h = 1;
    while ( h < N/3) h = 3*h + 1;
    while( h >= 1 ){
      for (int i = h; i < N; i++)
      {
        for (int j = i; j >=h && less(a[j], a[j-h]); j -= h)
          exch(a, j, j-h);
      }
      StdOut.println(h + " ");
      h = h/3;
      
    }
//    show(a);
  }
  
  private static boolean less(Comparable v, Comparable w)
  { return v.compareTo(w) < 0;}
  
  private static void exch(Comparable[] a, int i, int j)
  { Comparable t = a[i]; a[i] = a[j]; a[j] = t;}
  
  private static void show(Comparable[] a)
  {
    for (int i = 0; i < a.length; i++)
      StdOut.print(a[i] + " ");
    StdOut.println();
  }
  
  public static boolean isSorted(Comparable[] a)
  {
    for(int i = 1; i < a.length; i++)
      if (less(a[i], a[i-1]))   return false;
    return true;
  }
  
  public static void main(String[] args)
  {
    String[] a = {"S", "O", "R", "T", "E", "X", "A", "M", "P", "L", "E"};
    sort(a);
    assert isSorted(a);
    show(a);
  }
}