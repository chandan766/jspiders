/*
  Write a Java program to find 2nd largest element in a given array.
  Input-{1,2,1,3,2,4}
  Output-{3}
 */
package questions;

public class Q22 {

    public static int secondMax(int[] arr){
        int max = Integer.MIN_VALUE;
        int secondMax = max;

        for(int i:arr){
            if(i>max){
                secondMax = max;
                max = i;
            }else if(i>secondMax) secondMax = i;
        }

        return secondMax;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,1,3,5,7,6,2,4};
        System.out.println(secondMax(arr));
    }
    
}
