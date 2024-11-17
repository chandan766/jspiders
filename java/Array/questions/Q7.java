/*
  Write a Java program to print even index values sum and odd index
  values sum.
  Input-{1,2,3,4,5,6}
  Output-{ 9 (sum of even index), 12(sum of odd index) }
 */
package questions;

public class Q7 { 

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int evenSum = 0;
        int oddSum = 0;
        for(int i=0;i<arr.length;i++){
            if(i%2==0) evenSum+=arr[i];
            else oddSum+=arr[i];
        }

        System.out.println("Sum of Even index values: "+evenSum);
        System.out.println("Sum of Odd index values: "+oddSum);
    }
    
}
