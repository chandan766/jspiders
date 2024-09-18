/*  Pattern printing
*  x x x x x x x
*    x x x x x
*      x x x
 *       x
 */

import java.util.*;
public class Pattern9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a num: ");
        int n = sc.nextInt();
        int k = n+2;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=k;j++)
            {
                System.out.print("x");
            }
            System.out.println();
            k-=2;
        }
    }
}
