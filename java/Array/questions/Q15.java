/*
   Write a Java program to print an array's last index value of a given element.
   Input-{1,2,9,3,9,4,9,6,7,8} find the last index of 9
   Output-{6}
 */
package questions;

public class Q15 {
    
    public static int lastIndexOf(int arr[], int n){
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]==n) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,9,3,9,4,9,6,7,8};
        System.out.println(lastIndexOf(arr,9));
    }
}
