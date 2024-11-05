/*
   - This program checks if two given words are anagrams of each other
   - An anagram means both words contain the same characters in any order.
   input: "race" "care"
   output: true
 */

import java.util.Scanner;
public class Anagram {
	
	public static boolean isAnagram(String s1, String s2) {
		if(s1.length()!=s2.length()) return false;
		while(true) {
			if(s1.length()==0 && s2.length()==0) return true;
			char c = s1.charAt(0);
			s1 = s1.replace(c+"", "");
			s2 = s2.replace(c+"", "");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter First String: ");
		String s1 = sc.next();
		System.out.print("Enter Second String: ");
		String s2 = sc.next();
		System.out.println(isAnagram(s1,s2));
		
	}

}
