/*
  Write a Java program to print the sum of an array of elements.
    Input-{1,2,3,4,5,6}
    Output-{21}
 */
package questions;

public class Q6 {

    public static int sumOfelements(int[] arr){
        int sum = 0;
        for(int i:arr) sum+=i;
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        System.out.println(sumOfelements(arr));
    }
    
}
