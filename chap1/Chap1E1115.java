//import java.util.Arrays;
//import java.util.Scanner;
/**
 * Exercises 1.1.15
 */
public class Chap1E1115 {
    static int[] histogram(int[] nums, int M)
    {
        int[] ret = new int[M];
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] >= 0 && nums[i] < M)
            {
                ret[nums[i]]++;
            }
        }
        return ret;
    }
    
    public static void main(String[] args) {
        //int[] nums;// = new int[10];
        int M = 5;
        int[] ret = new int[M];
        int nums[] = {1,2,3,4,5,6,1,0,0,1};
        ret = histogram(nums, M);
        for(int i = 0; i < ret.length; i++)
            StdOut.println(Integer.toString(ret[i]));
    }
}