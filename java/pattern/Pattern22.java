/*
    1 2 3 4 5
    10 9 8 7 6
    11 12 13 14 15
    20 19 18 17 16
    21 22 23 24 25
 */
import java.util.Scanner;

public class Pattern22 {
    public static void main(String[] args) {
        System.out.print("Enter a num: ");
        int n = new Scanner(System.in).nextInt();
        int k = 1,l=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i%2>0){
                    System.out.print(k+" ");
                    k++;
                }
                else{
                    System.out.print(l+" ");
                    l--;
                    k++;
                }
            }
            l = k+n-1;
            System.out.println();
        }
    }
}
