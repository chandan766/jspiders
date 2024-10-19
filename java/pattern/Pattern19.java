/* Print Pattern using recursion
*1
*1 2 1
*1 2 3 2 1
*1 2 3 4 3 2 1
*1 2 3 4 5 4 3 2 1
*/

import java.util.Scanner;
public class Pattern19 {
    public static void m1(int k, int n){
        if(k>n) return;
        m2(1,k);
        System.out.println();
        m1(k+1,n);
    }
    public static void m2(int i, int j){
        System.out.print(i+" ");
        if(i==j) return;
        m2(i+1,j);
        System.out.print(i+" ");
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = sc.nextInt();
        m1(1,size);
    }
    
}