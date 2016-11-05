import java.util.*;

public class Chap2E1_11
{
  public static int[] convertIntegers(List<Integer> integers)
  {
    int[] ret = new int[integers.size()];
    for (int i=0; i < ret.length; i++)
    {
        ret[i] = integers.get(i).intValue();
    }
    return ret;
  }
  
  public static void sort(Comparable[] a)
  { //ShellSort
    int N = a.length;
    int upper = 1;
    List<Integer> steps = new ArrayList<Integer>();
    while ( upper < N/3) upper = 3*upper + 1;
    while ( upper >= 1) {steps.add(upper); upper = upper/3;}
    int[] hs = convertIntegers(steps);
    for ( int h:hs){
      for (int i = h; i < N; i++)
      {
        for (int j = i; j >=h && less(a[j], a[j-h]); j -= h)
          exch(a, j, j-h);
      }
      StdOut.println(h + " ");
    }
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