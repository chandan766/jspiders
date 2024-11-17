/*
   Write a Java program to insert even values in an array, the user will enter the values.
 */
package questions;

import java.util.Scanner;

public class Q14 {

    public static boolean isEven(int n){
        return n%2==0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of total elements: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<arr.length;i++){
            System.out.print("["+(i+1)+"]: ");
            int ele = sc.nextInt();
            if(isEven(ele)) arr[i] = ele;
            else{
                System.out.println("Please Enter only even number!");
                i--;
            }
        }

        System.out.print("Array elements: ");
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
    
}
