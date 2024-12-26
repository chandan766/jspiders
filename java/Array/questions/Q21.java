/*
  Write a Java program to find the smallest element in a given array.
  Input-{1,2,1,3,2,4}
  Output-{1}
 */
package questions;

public class Q21 {

    public static int smallestEle(int[] arr){
        if(arr.length==0) return Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i:arr){
            if(i<min) min = i;
        }

        return min;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,1,3,2,4 };
        System.out.println(smallestEle(arr));
    }
    
}
