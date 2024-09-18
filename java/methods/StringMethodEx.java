/**
 * This class demonstrates various types of methods that return a `String` value,
 * including static and non-static methods, and how to call them.
 */
public class StringMethodEx {

    /**
     * Static method without arguments that returns a fixed String value.
     * - Returns a fixed message: "Hello, World!".
     * @return "Hello, World!"
     */
    public static String m1() {
        return "Hello, World!";
    }

    /**
     * Static method with one formal argument that returns a personalized greeting.
     * - Accepts a name as input and returns a greeting message with the name.
     * @param name the name to include in the greeting
     * @return a greeting message that includes the provided `name`
     */
    public static String m2(String name) {
        return "Hello, " + name + "!";
    }

    /**
     * Static method with two formal arguments that concatenates two Strings.
     * - Accepts two Strings and returns their concatenation.
     * @param first the first String
     * @param second the second String
     * @return the concatenated result of `first` and `second`
     */
    public static String m3(String first, String second) {
        return first + " " + second;
    }

    /**
     * Static method with three formal arguments that returns the longest String.
     * - Takes three Strings and returns the longest one.
     * @param s1 the first String
     * @param s2 the second String
     * @param s3 the third String
     * @return the longest String among `s1`, `s2`, and `s3`
     */
    public static String m4(String s1, String s2, String s3) {
        String longest = s1.length() > s2.length() ? s1 : s2;
        longest = longest.length() > s3.length() ? longest : s3;
        return longest;
    }

    /**
     * Non-static method without arguments that returns a default message.
     * - Returns a fixed message: "This is a non-static method!".
     * @return "This is a non-static method!"
     */
    public String m5() {
        return "This is a non-static method!";
    }

    /**
     * Non-static method with one formal argument that converts the string to uppercase.
     * - Accepts a String and returns it in uppercase.
     * @param str the string to convert to uppercase
     * @return the uppercase version of `str`
     */
    public String m6(String str) {
        return str.toUpperCase();
    }

    /**
     * Non-static method with two formal arguments that repeats a string multiple times.
     * - Takes a String and an integer, and returns the String repeated `times` times.
     * @param str the String to repeat
     * @param times the number of times to repeat the String
     * @return the String repeated `times` times
     */
    public String m7(String str, int times) {
        return str.repeat(times);
    }

    /**
     * Non-static method with three formal arguments that returns the longest word.
     * - Accepts three words and returns the word with the most characters.
     * @param w1 the first word
     * @param w2 the second word
     * @param w3 the third word
     * @return the word with the most characters among `w1`, `w2`, and `w3`
     */
    public String m8(String w1, String w2, String w3) {
        return m4(w1, w2, w3); // Reusing the static method m4
    }

    public static void main(String[] args) {
        // Calling static methods directly without creating an object
        System.out.println("m1: " + m1()); // Static method without arguments
        System.out.println("m2: " + m2("Alice")); // Static method with one argument
        System.out.println("m3: " + m3("Java", "Programming")); // Static method with two arguments
        System.out.println("m4: " + m4("Hello", "World", "Java")); // Static method with three arguments
      
        // Creating an object to call non-static methods
        StringMethodEx example = new StringMethodEx();

        // Calling non-static methods using the object
        System.out.println("m5: " + example.m5()); // Non-static method without arguments
        System.out.println("m6: " + example.m6("java")); // Non-static method with one argument
        System.out.println("m7: " + example.m7("Repeat", 3)); // Non-static method with two arguments
        System.out.println("m8: " + example.m8("apple", "banana", "cherry")); // Non-static method with three arguments

        // Alternative way to call non-static methods using an anonymous object
        System.out.println("Anonymous m6: " + new StringMethodEx().m6("Anonymous")); // Calling m6 using an anonymous object
    }
}
