/*
 * This program finds the highest prime digit in a given number.
 * 
 * Example:
 * Input:  439825
 * Output: 5
 */

import java.util.Scanner;
public class HighestPrimeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = sc.nextInt();
        int max=0;

        while (n>0) {
            int t = n%10;
            boolean flag = t<=1?false:true;
            for(int i=2;i<=t/2;i++){
                if(t%i==0){
                    flag=false;
                    break;
                }
            }
            if(flag){
                if(t>max){
                    max = t;
                }
            }
            n/=10;
        }
        System.out.println("Highest Prime digit is "+max);
    }
}
