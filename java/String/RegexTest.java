import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest {
    public static void main(String[] args) {
        String s = "df04g6f63d";
        Pattern p = Pattern.compile("[g/0][a-zA-Z0-9]\\1");
        Matcher m = p.matcher(s);

        while(m.find()){
            System.out.println(m.group());
            // System.out.println(m.start());
            // System.out.println(m.end());
            
        }
    }
}
