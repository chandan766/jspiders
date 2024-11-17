/*
  Write a Java program to find the largest element in a given array.
  Input-{1,2,1,3,2,4}
  Output-{4}
 */
package questions;

public class Q20 {

    public static int largestElement(int[] arr){
        int l = Integer.MIN_VALUE;
        for(int i:arr){
            if(i>l) l = i;
        }
        return l;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,1,3,2,4};
        System.out.println(largestElement(arr));
    }
    
}
