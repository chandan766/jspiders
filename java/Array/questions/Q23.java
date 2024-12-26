/*
 Write a Java program to find 2nd smallest element in a given array.
 Input-{1,2,1,3,2,4}
    Output-{2}
 */
package questions;

public class Q23 {
    public static int secondMin(int[] arr){
        int min = Integer.MAX_VALUE;
        int secondMin = min;

        for(int i: arr){
            if(i<min){
                secondMin = min;
                min = i;
            }else if(i<secondMin && i>min) {
                secondMin = i;
            }
        }
        return secondMin;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,1,3,2,4,5,0};
        System.out.println(secondMin(arr));
    }
}
