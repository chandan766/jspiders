package Programs;
import java.util.Scanner;


public class Test {
    public static int countWords(String s){
       if(s.length()==0) return 0;
       if(s.length()>0 && s.isBlank()) return 0;
       char[] c = s.toCharArray();
       int count = 1;
       for(int i=0;i<c.length;i++){
            if(i==0 && c[i]==' ') continue;
            if(i==c.length-1 && c[i]==' ') continue;
            if(c[i]==' ') count++;
       }
       return count;
    }
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // String n= sc.nextLine();
        String s = " ";
        System.out.println("count: "+countWords(s));
    }
}
