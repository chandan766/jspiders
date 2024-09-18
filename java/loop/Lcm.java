/*
 * This program finds the Least Common Multiple (LCM) of two numbers.
 * 
 * Example:
 * Input:  12, 15
 * Output: 60
 */

import java.util.Scanner;
public class Lcm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first num: ");
        int a = sc.nextInt();
        System.out.print("Enter the second num: ");
        int b = sc.nextInt();
        int n = a>b?a:b;
        int i = n;
        while (true) {
           if(n%a==0 && n%b==0){
               break;
           }
           n++;
        }
        System.out.println(n);
        
    }
}
