/*
  Program for compress and decompress the given String
  <Compress>
  input--> abbceee
  output--> a2bc3e
  
  <Decompress>
  input--> a2bc3e
  output--> abbceee
 */
import java.util.Scanner;
public class Codec {
    public static String compress(String s){
        char[] c = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        int count = 1;
        char pre = c[0];
        for(int i=1;i<=c.length;i++){
            while(i<c.length && pre==c[i]){
                count++;
                i++;
            }
            if(count>1){
                sb.append(count);
                count=1;
            }
            sb.append(pre);
            pre = (i==c.length)?c[i-1]:c[i];
            
        }
        return sb.toString();
    }

    public static String decompress(String s){
        char[] c = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        int count = 0;
        String num = "";
        for(int i=0;i<c.length;i++){
            while(c[i]>='1' && c[i]<='9'){
                num+=c[i];
                i++;
            } 
            if(num.length()>0){
                count = Integer.parseInt(num);
                num="";
            }else{
                sb.append(c[i]);
            }
            while(count>0){
                sb.append(c[i]);
                count--;
            }  
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = new Scanner(System.in).next();
        System.out.println(compress(s));
        System.out.println(decompress(compress(s)));
    }
    
}
