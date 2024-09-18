/*
 * This program finds the Greatest Common Divisor (GCD) of two numbers.
 * 
 * Example:
 * Input:  54, 24
 * Output: 6
 */

import java.util.Scanner;

public class Gcd {
   
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first num: ");
        int n1 = sc.nextInt();
        System.out.print("Enter the second num: ");
        int n2 = sc.nextInt();
        
        while(n2!=0){
            int t = n2;
            n2 = n1%n2;
            n1 = t;
        }
         System.out.println("gcd: "+n1);
        
        
    }

    
}
