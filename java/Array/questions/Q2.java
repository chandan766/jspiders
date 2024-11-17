/*
    Write a Java program to print even index values of an array.
    Input-{1,2,3,4,5,6}
    Output-{1,3,5}
 */
package questions;

public class Q2 {


    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};

        for(int i=0;i<arr.length;i+=2){
            System.out.print(arr[i]+" ");
        }

    }
    
}
