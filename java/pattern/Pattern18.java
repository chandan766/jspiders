/*  Pattern printing
 *          x
 *        x x
 *      x   x
 *    x     x
 *  x x x x x
 */

 import java.util.*;
 public class Pattern18 {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter a num: ");
         int n = sc.nextInt();
         for(int i=1;i<=n;i++)
         { 
            for(int j=1;j<=n;j++){
             if(j<=n-i){
                 System.out.print(" ");
             }else{
                 if(i==1||i==n||j==n-i+1||j==n)
                 System.out.print("x");
                 else
                 System.out.print(" ");
             }
            }
             System.out.println();
         }
     }
 }