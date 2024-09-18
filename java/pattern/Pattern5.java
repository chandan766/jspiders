/* Print Pattern
*1
*1 2 1
*1 2 3 2 1
*1 2 3 4 3 2 1
*1 2 3 4 5 4 3 2 1
*/

import java.util.Scanner;
public class Pattern5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = sc.nextInt();
        for(int i=1;i<=size;i++)
        {
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            for(int k=i-1;k>=1;k--){
                System.out.print(k+" ");
            }
            System.out.println();
        }
        
    }
    
}
