/*
 * Guess the number in range from 1 to 9
 * if number will match with the random generated num
 * then you will win otherwise loose the game
 * there are 3 chances to guess correctly
 */
import java.util.Scanner;
public class GuessNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int randNum = (int)(Math.random()*9)+1;
        System.out.println(randNum);
        System.out.println("-".repeat(35));
        System.out.println("Guess the number range from 1 to 9\nyou get 3 chance to guess correctly");
        System.out.println("-".repeat(35));
        for(int i = 1;i<=3;i++)
        {
            System.out.print("Enter the num: ");
            int num = sc.nextInt();
            if(randNum==num){
                System.out.println("**[Congratulations!]** You successfully geuss the number!");
                break;
            }else if(i<3){
                System.out.println("<Oops! wrong ans Try again "+(3-i)+" more chance left>");
            }else{
                System.out.println("---No more chance left! Try next time---");
            }
        }
        
    }
}
