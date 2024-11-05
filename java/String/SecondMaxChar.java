/*
   print second max character and its frequency from given string
   input: jaaavvaa
   output: v=2
 */
import java.util.Scanner;

public class SecondMaxChar {
	
	public static void secondMaxCharCount(String s) {
		int freq=0;
		int max = 0;
		int second_max = 0;
		char ch = s.charAt(0);
		while(s.length()!=0) {
			String s1 = "";
			for(int j=0;j<s.length();j++) {
				if(s.charAt(0)==s.charAt(j)) freq++;
				else s1+=s.charAt(j);
			}
			if(freq>max) max = freq;
			else if(freq>second_max){
				second_max = freq;
				ch = s.charAt(0);
			}
			s=s1;
			freq = 0;
		}
		System.out.println(ch+": "+second_max);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter an String: ");
		String s = sc.next();
		secondMaxCharCount(s);
		

	}

}
