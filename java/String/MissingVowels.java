/*
 * this program identifies which vowels (a, e, i, o, u) are absent in the input.
 * For example, given the input "hello world", the output will be "a, i, u" as these vowel
 * 
 */

import java.util.Scanner;

public class MissingVowels {
	
	public static void missingVowels(String s) {
		char[] l = new char[s.length()];
		char[] u = new char[s.length()];
		String v = "aeiouAEIOU";
		int j=0,k=0;
		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
				l[j++] = ch;
			}else if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U') {
				u[k++] = ch;
			}
		}
		char[] arr = l;
		for(int i=0;i<10;i++) {
			boolean flag = true;
			if(arr[0]==0) return;
			for(char c: arr) {
				if(v.charAt(i)==c) {
					flag=false;
					break;
				}
			}
			if(flag) System.out.print(v.charAt(i)+" ");
			if(i==4) {
				arr = u;
			}
					
		}
			
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter an String: ");
		String s = sc.next();
		missingVowels(s);
		
	}

}
