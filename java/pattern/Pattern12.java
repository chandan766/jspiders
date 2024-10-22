/*  Pattern printing
 *        x
 *      x x x
 *    x x x x x
 *  x x x x x x x
 *    x x x x x
 *      x x x
 *        x 
 */

import java.util.*;
public class Pattern12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an odd num: ");
        int n = sc.nextInt();
        int k = 1;
        for(int i=1;i<=n;i++)
        {   
            int m = n/2+1;
            for(int j=1;j<=(m>i?m-i:i-m);j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=k;j++)
            {
                System.out.print("x");
            }
            System.out.println();
            if(i<=m){
                k+=2;
                if(i==m)
                {
                    k-=4;
                }
            }else{
                k-=2;
            }
        }
    }
}
