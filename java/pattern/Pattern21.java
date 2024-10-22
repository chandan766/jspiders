/*  Pattern printing
    x         x
    xx       xx
    xxx     xxx
    xxxx   xxxx
    xxxxx xxxxx
    xxxxxxxxxxx
    xxxxx xxxxx
    xxxx   xxxx
    xxx     xxx
    xx       xx
    x         x

*/

import java.util.*;
public class Pattern21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an odd num: ");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            int m = n/2+1;
            for(int j=1;j<=n;j++)
            {
                if(i<=m){
                    if (j<=i) {  
                        System.out.print("x");
                    }
                    else{
                       if(j<=n-i) System.out.print(" ");
                       else System.out.print("x");
                    }
                }
                else{
                    if(j<=n-i+1){
                        System.out.print("x");
                    }else{
                       if(j<=i-1) System.out.print(" ");
                       else System.out.print("x");
                    }
                }
            }
            System.out.println();
        }
    }
}
