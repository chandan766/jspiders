/*  Pattern printing
*              x
*            x x
*          x x x
*        x x x x
*      x x x x x
*        x x x x
*          x x x
*            x x
*              x
 */

import java.util.*;
public class Pattern10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a num: ");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++)
        {   
            int m = n/2+1;
            for(int j=1;j<=m;j++){
                if(i<=m){
                    if (j<=m-i) {
                        System.out.print(" ");
                    }else{
                        System.out.print("x");
                    }
                }else{
                    if (j<=i-m) {
                        System.out.print(" ");
                    }else{
                        System.out.print("x");
                    }
                }
               }
                System.out.println();
        }
    }
}
