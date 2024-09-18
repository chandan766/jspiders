
import java.util.Scanner;
public class VowelCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		System.out.print("Enter the character: ");
        char c = sc.next().toLowerCase().charAt(0);
        if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
            System.out.println(c+" is a vowel");
        }
        else{
            System.out.println(c+" is not a vowel");
        }
        
    }
}
