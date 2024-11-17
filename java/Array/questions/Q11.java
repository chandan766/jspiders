/*
  Write a Java program to print prime numbers present in an array.
  Input-{1,2,3,4,5,6}
  Output-{2,3,5}
 */
package questions;

public class Q11 {

    public static boolean isPrime(int n){
        if(n<2) return false;
        for(int i=2;i<=n/2;i++){
            if(n%i==0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};

        for(int i=0;i<arr.length;i++){
           if(isPrime(arr[i])) System.out.print(arr[i]+" ");
        }
    }
    
}
