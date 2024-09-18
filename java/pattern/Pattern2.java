/* Print Pattern
 * row = 6, col = 3
 * 1 2 3
 * 6 5 4
 * 7 8 9
 * 12 11 10
 * 13 14 15
 * 18 17 16
 */

import java.util.Scanner;
public class Pattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the row: ");
        int row = sc.nextInt();
        System.out.print("Enter the column: ");
        int col = sc.nextInt();
        int k = 1;
        for(int i=1;i<=row;i++)
        {
            if(i%2>0){
                for(int j=1;j<=col;j++){
                    System.out.print(k+" ");
                    k++;
                }
            }else{
                int t = k+col-1;
                k = t+1;
                for(int j=1;j<=col;j++){
                    System.out.print(t+" ");
                    t--;
                }
                
            }
            System.out.println();
        }
        
    }
    
}
