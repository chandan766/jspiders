/*
 * 2
 * 3 5
 * 7 11 13
 * 17 19 23 29
 */

import java.util.Scanner;

public class Pattern15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a num: ");
        int n = sc.nextInt();
        int k=2;
        for(int i=1;i<=n;i++)
        {   
            for(int j=1;j<=i;j++)
            {
                for(int d=2;d<=k/2;d++){
                    // System.out.print(k+"/"+d+" ");
                    if(k%d==0){
                        k++;
                        d=2;
                    }
                }
                System.out.print(k+" ");
                // System.out.println();
                k++;
            }
            System.out.println();
        }
    }
}
