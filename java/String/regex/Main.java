package regex;
public class Main {
    /*
        at least one capital
        at least one small
        at least one special char
        at least one num
        password length min 6 and max 12
     */
    public static void main(String[] args) {
        String s = "124@ap11111C";
        Test t = new Test();
        // System.out.println(t.isValidPassword(s));
        // System.out.println(t.isValidEmail("@gmail.com"));
        // System.out.println(t.isAlpha("chandan"));
        // System.out.println(t.isDigit("452"));
        // System.out.println(t.isSpecialChar("**-+"));
        System.out.println(t.isAlphaNumeric("88sdd"));
    }
}
