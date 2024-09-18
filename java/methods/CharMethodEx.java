/**
 * This class demonstrates various types of methods that return a `char` value,
 * including static and non-static methods, and how to call them.
 */
public class CharMethodEx {

    /**
     * Static method without arguments that returns a fixed char value.
     * - Returns the character 'A'.
     * @return 'A'
     */
    public static char m1() {
        return 'A';
    }

    /**
     * Static method with one formal argument that returns the first character of a string.
     * - Accepts a string and returns the first character.
     * - If the string is empty, it returns a space character ' '.
     * @param str the input string
     * @return the first character of `str`, or ' ' if `str` is empty
     */
    public static char m2(String str) {
        return str.isEmpty() ? ' ' : str.charAt(0);
    }

    /**
     * Static method with two formal arguments that returns the character at a specified index.
     * - Accepts a string and an index, and returns the character at that index.
     * - If the index is out of bounds, it returns a question mark '?'.
     * @param str the input string
     * @param index the position to extract the character from
     * @return the character at `index` in `str`, or '?' if the index is out of bounds
     */
    public static char m3(String str, int index) {
        return index >= 0 && index < str.length() ? str.charAt(index) : '?';
    }

    /**
     * Static method with three formal arguments that returns the maximum character.
     * - Accepts three characters and returns the one with the highest Unicode value.
     * @param c1 the first character
     * @param c2 the second character
     * @param c3 the third character
     * @return the character with the highest Unicode value among `c1`, `c2`, and `c3`
     */
    public static char m4(char c1, char c2, char c3) {
        char max = c1 > c2 ? c1 : c2;
        return max > c3 ? max : c3;
    }

    /**
     * Non-static method without arguments that returns a default char value.
     * - Returns the character 'Z'.
     * @return 'Z'
     */
    public char m5() {
        return 'Z';
    }

    /**
     * Non-static method with one formal argument that converts a lowercase letter to uppercase.
     * - If the input character is a lowercase letter, it returns its uppercase equivalent.
     * - Otherwise, it returns the character as it is.
     * @param c the input character
     * @return the uppercase equivalent of `c` if it's a lowercase letter; otherwise, `c`
     */
    public char m6(char c) {
        return Character.isLowerCase(c) ? Character.toUpperCase(c) : c;
    }

    /**
     * Non-static method with two formal arguments that returns the greater of two characters.
     * - Compares two characters and returns the one with the higher Unicode value.
     * @param c1 the first character
     * @param c2 the second character
     * @return the character with the higher Unicode value between `c1` and `c2`
     */
    public char m7(char c1, char c2) {
        return c1 > c2 ? c1 : c2;
    }

    /**
     * Non-static method with three formal arguments that returns the minimum character.
     * - Accepts three characters and returns the one with the lowest Unicode value.
     * @param c1 the first character
     * @param c2 the second character
     * @param c3 the third character
     * @return the character with the lowest Unicode value among `c1`, `c2`, and `c3`
     */
    public char m8(char c1, char c2, char c3) {
        char min = c1 < c2 ? c1 : c2;
        return min < c3 ? min : c3;
    }

    public static void main(String[] args) {
        // Calling static methods directly without creating an object
        System.out.println("m1: " + m1()); // Static method without arguments
        System.out.println("m2: " + m2("Hello")); // Static method with one argument
        System.out.println("m3: " + m3("Java", 2)); // Static method with two arguments
        System.out.println("m4: " + m4('A', 'B', 'C')); // Static method with three arguments

        // Creating an object to call non-static methods
        CharMethodEx example = new CharMethodEx();

        // Calling non-static methods using the object
        System.out.println("m5: " + example.m5()); // Non-static method without arguments
        System.out.println("m6: " + example.m6('x')); // Non-static method with one argument
        System.out.println("m7: " + example.m7('A', 'z')); // Non-static method with two arguments
        System.out.println("m8: " + example.m8('a', 'x', 'm')); // Non-static method with three arguments

        // Alternative way to call non-static methods using an anonymous object
        System.out.println("Anonymous m6: " + new CharMethodEx().m6('k')); // Calling m6 using an anonymous object
    }
}
