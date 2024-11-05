/*
  - A pangram is a sentence that contains every letter of the alphabet at least once.
  input: "The quick brown fox jumps over the lazy dog"
  output: true
 */

import java.util.Scanner;

public class Pangram {
	public static boolean isPangram(String s) {
		s = s.toLowerCase();
		if(s.length()<26) return false;
		for(char c='a';c<='z';c++) {
			if(s.indexOf(c)==-1) return false;
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Sentence: ");
		String s = sc.nextLine();
		System.out.println(isPangram(s));

	}

}
