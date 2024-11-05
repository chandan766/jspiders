/*
    encoding the position of character into number if its frequency is greater than 1
    input: Hello World
    output: He121 w2r3d
 */

import java.util.Scanner;

public class PositionEncode {
	public static String position_encode(String s) {
		char[] c = s.toCharArray();
        for(int i=0;i<c.length;i++){
			int count=0;
            for(int j=0;j<c.length;j++){
				if(s.charAt(i)==s.charAt(j)){
					count++;
					if(count>1){
						c[i] = '1';
						c[j]=(char)(count+'0');
					}
				}
            }
        }
        return new String(c);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter an String: ");
		String s = sc.nextLine();
		System.out.println(position_encode(s));
	}

}
