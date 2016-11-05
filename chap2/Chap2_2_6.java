/******************************************************************************
 *  Compute the exact value of the number of array accesses used by top-down
 *  and bottom-up mergesort. N from 1 to 512. Compare with the upper bound 6NlogN
 */
public class Chap2_2_6 {
    private Chap2_2_6() { }
    private static int access_num;
    // stably merge a[lo .. mid] with a[mid+1 ..hi] using aux[lo .. hi]
    private static void merge(Comparable[] a, Comparable[] aux, int lo, int mid, int hi) {
        // precondition: a[lo .. mid] and a[mid+1 .. hi] are sorted subarrays
        assert isSorted(a, lo, mid);
        assert isSorted(a, mid+1, hi);

        // copy to aux[]
        for (int k = lo; k <= hi; k++) {
            aux[k] = a[k]; 
        }

        // merge back to a[]
        int i = lo, j = mid+1;
        for (int k = lo; k <= hi; k++) {
            if      (i > mid)              a[k] = aux[j++];
            else if (j > hi)               a[k] = aux[i++];
            else if (less(aux[j], aux[i])) a[k] = aux[j++];
            else                           a[k] = aux[i++];
            access_num++;
        }

        // postcondition: a[lo .. hi] is sorted
        assert isSorted(a, lo, hi);
    }

    
    // top down mergesort a[lo..hi] using auxiliary array aux[lo..hi]
    private static void sort(Comparable[] a, Comparable[] aux, int lo, int hi) {
        if (hi <= lo) return;
        int mid = lo + (hi - lo) / 2;
        sort(a, aux, lo, mid);
        sort(a, aux, mid + 1, hi);
        merge(a, aux, lo, mid, hi);
    }

    /**
     * Rearranges the array in ascending order, using the natural order.
     * @param a the array to be sorted
     */
    public static void td_sort(Comparable[] a, int end) {
        Comparable[] aux = new Comparable[end+1];
        sort(a, aux, 0, end);
        assert isSorted(a, 0, end);
    }

    // bottom up mergesort a[lo..hi] using auxiliary array aux[lo..hi]
    public static void bu_sort(Comparable[] a, int end){
        int N = end+1;
        Comparable[] aux = new Comparable[N];
        
        for (int sz = 1; sz < N; sz = sz+sz)
          for (int lo = 0; lo < N-sz; lo += sz+sz)
             merge(a, aux, lo, lo+sz-1, Math.min(lo+sz+sz-1, N-1));

        assert isSorted(a, 0, end);
    }

   /***************************************************************************
    *  Helper sorting function.
    ***************************************************************************/
    
    // is v < w ?
    private static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }
        
   /***************************************************************************
    *  Check if array is sorted - useful for debugging.
    ***************************************************************************/
    private static boolean isSorted(Comparable[] a) {
        return isSorted(a, 0, a.length - 1);
    }

    private static boolean isSorted(Comparable[] a, int lo, int hi) {
        for (int i = lo + 1; i <= hi; i++)
            if (less(a[i], a[i-1])) return false;
        return true;
    }

    // print array to standard output
    private static void show(Comparable[] a) {
        for (int i = 0; i < a.length; i++) {
            StdOut.println(a[i]);
        }
    }

    /**
     * Reads in a sequence of strings from standard input; mergesorts them; 
     * and prints them to standard output in ascending order. 
     *
     * @param args the command-line arguments
     */
    public static void main(String[] args) {
//        In in = new In(args[0]);
//        String[] a = in.readAllStrings();
//        String[] a = StdIn.readAllStrings();
        int N = 512;
        Integer[] sv = new Integer[N], a = sv;
        for (int i = 0; i < N; i++)
          sv[i] = StdRandom.uniform(N);
        for (int n = 0; n < N; n++){
          a = sv;
          access_num = 0;
          StdOut.print("n = " + n);
          Chap2_2_6.bu_sort(a, n);
          StdOut.print(" bu an = " + access_num);
          a = sv;
          access_num = 0;
          Chap2_2_6.td_sort(a, n);
          StdOut.println(" td an = " + access_num + " 6NlogN = " + 6*n*Math.log(n));
        }
    //    show(a);
    }
}
