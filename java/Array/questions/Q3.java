/*
    Write a Java program to print odd index values of an array.
    Input-{1,2,3,4,5,6}
    Output-{2,4,6}
 */
package questions;

public class Q3 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};

        for(int i=1;i<arr.length;i+=2){
            System.out.print(arr[i]+" ");
        }
    }
}
