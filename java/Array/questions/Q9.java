/*
    Write a Java program to print odd elements sum.
    Input-{1,2,3,4,5,6}
    Output-{9}
 */
package questions;

public class Q9 {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int sum = 0;
        for(int i=0;i<arr.length;i+=2){
            if(arr[i]%2!=0) sum+=arr[i];
        }
        System.out.println(sum);
    }
    
}
