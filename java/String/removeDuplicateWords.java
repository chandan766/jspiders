import java.util.HashSet;

public class removeDuplicateWords {
    public static void main(String[] args) {
        String s = "Happy Happy Birthday";
        HashSet<String> hs = new HashSet<>();
        for(String item:s.split(" ")){
            hs.add(item);
        }

        String s1 = String.join(" ",hs);
        System.out.println(s1);
    }
}