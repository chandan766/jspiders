// input: "ccaabbd" output: "aabbccd" (sort given string)?

package Programs;

public class Q23 {

    public static String sort(String s){
        String sorted = "";
        for(char c='A';c<='Z';c++){
            for(char c1:s.toCharArray()){
                if(c1==c || c1==(char)(c+32)){
                    sorted+=c1;
                }
            }
        }
        return sorted;
    }

    public static void main(String[] args) {
        String s = "ccaabbd";
        System.out.println(sort(s));
    }
    
}
