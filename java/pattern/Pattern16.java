/* 1111A1111
 * 222BBB222
 * 33CCCCC33
 * 4DDDDDDD4
 */


import java.util.*;
public class Pattern16 {
    public static void main(String[] args) {
        System.out.print("Enter a num: ");
        int n = (new Scanner(System.in)).nextInt();
        int k = 1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(i);
            }
            for(int j=1;j<=k;j++)
            {
                System.out.print((char)(i+64));
            }
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(i);
            }
            System.out.println();
            k+=2;
        }
    }
    
}
