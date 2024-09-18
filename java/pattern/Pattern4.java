/* Print Pattern
 *1 2 2 2 2
 *2 2 3 3 3
 *3 3 3 4 4
 *4 4 4 4 5
 *5 5 5 5 5 
 */

import java.util.Scanner;
public class Pattern4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = sc.nextInt();
        for(int i=1;i<=size;i++)
        {
            for(int j=1;j<=size;j++){
                if(j<=i)
                System.out.print(i+" ");
                else
                System.out.print((i+1)+" ");
            }
            System.out.println();
        }
        
    }
    
}
