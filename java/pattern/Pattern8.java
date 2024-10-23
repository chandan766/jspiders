/*  Pattern printing
 *        x
 *      x x x
 *    x x x x x
 *  x x x x x x x
 */

import java.util.*;
public class Pattern8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of lines: ");
        int n = sc.nextInt();
        int k = 0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n+k;j++){
                if(j<=n-i) System.out.print(" ");
                else System.out.print("x");
            }
            System.out.println();
            k++;
        }
    }
}
