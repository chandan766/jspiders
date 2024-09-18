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
        System.out.print("Enter a num: ");
        int n = (new Scanner(System.in)).nextInt();
        int stars = n/2+1;
        int spaces = 0;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=stars;j++)
            {
                System.out.print("x");
            }
            for(int j=1;j<=spaces;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=stars;j++)
            {
                System.out.print("x");
            }
            System.out.println();
            if(i<=n/2){
                stars--;
                if(i==1){
                    spaces=1;
                } 
                else{
                spaces+=2;
               } 
            }
            else{
                stars++;
                spaces-=2;
            }
        }
    }
}
