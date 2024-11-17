/*
   - This program checks if two given words are anagrams of each other
   - An anagram means both words contain the same characters in any order.
   input: "race" "care"
   output: true
 */

import java.util.Scanner;
public class Anagram {
	
	public static boolean isAnagram(String s1, String s2) {
		while(true) {
			if(s1.length()!=s2.length()) return false;
			if(s1.length()==0 && s2.length()==0) return true;
			char c = s1.charAt(0);
			s1 = s1.replace(c+"", "");
			s2 = s2.replace(c+"", "");
		}
	}

	public static boolean checkAnagram(String s1, String s2){
		if(s1.length()!=s2.length()) return false;
		for(int i=0;i<s1.length();i++){
			String t = "";
			for(int j=0;j<s2.length();j++){
				if(s1.charAt(i)!=s2.charAt(j)) t+=s2.charAt(j);
			}
			s2 = t;
		}
		return s2.length()==0;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter First String: ");
		String s1 = sc.next();
		System.out.print("Enter Second String: ");
		String s2 = sc.next();
		System.out.println(isAnagram(s1,s2));
		// System.out.println(checkAnagram(s1,s2));
		
	}

}
