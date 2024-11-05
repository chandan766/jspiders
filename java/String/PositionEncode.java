/*
    encoding the position of character into number if its frequency is greater than 1
    input: Hello World
    output: He121 w2r3d
 */

import java.util.Scanner;

public class PositionEncode {
	
	public static String position_encode(String s) {
		char[] arr = s.toCharArray();
		for(int i=0;i<s.length();i++) {
			int count = 0;
			for(char c:s.toCharArray()) {
				if((s.charAt(i)==c) && !(c>='0' && c<='9')) count++;
			}
			if(count>1) {
				char k='1';
				for(int j = 0;j<arr.length;j++) {
					if(s.charAt(i)==arr[j]) {
						arr[j]=k++;
					}
				}
				s = new String(arr);
			}
		}
		return new String(arr);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter an String: ");
		String s = sc.nextLine();
		System.out.println(position_encode(s));
	}

}
