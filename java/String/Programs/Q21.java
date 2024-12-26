// input: "easy very is java" output: "java is very easy'
package Programs;

public class Q21 {

    public static void main(String[] args) {
        String s = "easy very is java";
        String result = "";
        for(int i=s.length()-1;i>=0;i--){
            String word="";
            while (i>=0 && s.charAt(i)!=' ') word+=s.charAt(i--);
            int len = word.length()-1;
            while(len>=0) result+=word.charAt(len--);
            if(i>0) result+=" ";
        }

        System.out.println(result);
    }
    
}
