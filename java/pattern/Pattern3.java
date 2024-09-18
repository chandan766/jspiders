/* Print Pattern
 * 1
 * 3 2
 * 4 5 6
 * 10 9 8 7
 * 11 12 13 14 15
 */

import java.util.Scanner;
public class Pattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = sc.nextInt();
        int k = 1;
        for(int i=1;i<=size;i++)
        {
            if(i%2>0){
                for(int j=1;j<=i;j++){
                    System.out.print(k+" ");
                    k++;
                }
            }else{
                int t = k+i-1;
                k = t+1;
                for(int j=1;j<=i;j++){
                    System.out.print(t+" ");
                    t--;
                }
                
            }
            System.out.println();
        }
        
    }
    
}
