/*
 * 1
 * 0 1
 * 1 0 1
 * 0 1 0 1
 * 1 0 1 0 1
 */

import java.util.Scanner;

public class Pattern14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a num: ");
        int n = sc.nextInt();
        int k = 1;
        for(int i=1;i<=n;i++)
        {   
            k = i%2>0?1:0;
            for(int j=1;j<=i;j++)
            {
                
                System.out.print(k+" ");
                k = (k==1)?0:1;
            }
            System.out.println();
        }
    }
}
