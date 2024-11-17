/*
   Write a Java program to count the number of zeros(0) present in a given array.
   Input-{1,0,3,0,5,6,0}
   Output-{3}
 */
package questions;

public class Q13 {
    public static int countZero(int[] arr){
        int count=0;
        for(int i:arr){
            if(i==0) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {1,0,3,0,5,6,0};
        System.out.println(countZero(arr));
    }
    
}
