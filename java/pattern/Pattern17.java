/*
 * xxxxxxxxxxx
 * xxxxx xxxxx
 * xxxx   xxxx
 * xxx     xxx
 * xx       xx
 * x         x
 * xx       xx
 * xxx     xxx
 * xxxx   xxxx
 * xxxxx xxxxx
 * xxxxxxxxxxx
 */

import java.util.*;
public class Pattern17 {
    public static void main(String[] args) {
        System.out.print("Enter an odd num: ");
        int n = (new Scanner(System.in)).nextInt();
        int stars = n/2+1;
        int spaces = n/2+1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(i==1 || i==n) System.out.print("x");
                else{
                    if(j<=stars) System.out.print("x");
                    else{
                        if(j<=spaces) System.out.print(" ");
                        else System.out.print("x");
                    } 
                }
            }
            System.out.println();
            if(i<=n/2){
                stars--;
                if(i>1) spaces +=1;
            }
            else{
                stars++;
                spaces -=1;
            }
        }
    }
}
