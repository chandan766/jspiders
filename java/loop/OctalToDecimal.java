/*
 * This program converts an octal number to its decimal equivalent.
 * 
 * Example:
 * Input:  72
 * Output: 58
 */

import java.util.Scanner;
public class OctalToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an octal number: ");
        int n = sc.nextInt();
        int dec = 0;
        int count = 0;
        while(n>0){
            int prod = 1;
            for(int i=1;i<=count;i++){
                prod *= 8;
            }
            count++;
            dec+=(n%10)*prod;
            n/=10;
        }

       System.out.println(dec);

    }

    
}
