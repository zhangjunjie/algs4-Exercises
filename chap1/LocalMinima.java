public class LocalMinima
{
 public static void main(String[] args)
 {
  int[] arr = {11,2,3,4,5,0,6,7,8,9,10};
  for (int num : arr)
   System.out.print(num + ", ");
  System.out.println();
  int minima = findLocalMinima(arr);
  System.out.println(minima);
 }

 private static int findLocalMinima(int[] arr)
 {
  return findLocalMinima(arr, 0, arr.length);
 }

 private static int findLocalMinima(int[] arr, int start, int end)
 {
  int mid = (start + end) / 2;
  if (mid - 2 < 0 && mid + 1 >= arr.length)
   return -1;
  if (arr[mid - 2] > arr[mid - 1] && arr[mid - 1] < arr[mid])
   return arr[mid - 1];
  if (arr[mid - 1] > arr[mid - 2])
   return findLocalMinima(arr, start, mid);
  else
   return findLocalMinima(arr, mid, end);
 }
 
 }