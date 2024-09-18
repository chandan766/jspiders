package overloading;
/**
 * This class demonstrates method overloading with different return types and parameter lists.
 * Overloading allows methods with the same name to perform different tasks 
 * based on the number and types of parameters passed to them.
 */
public class OverloadingEx {

    // Static methods

    /**
     * Static method with no arguments returning an int.
     * - Returns a fixed integer value.
     * @return 10
     */
    public static int getValue() {
        return 10;
    }

    /**
     * Static method with one integer argument returning a double.
     * - Accepts an integer and returns its double representation.
     * @param num the input integer
     * @return the double value of `num`
     */
    public static double getValue(int num) {
        return num * 1.0;
    }

    /**
     * Static method with two arguments, one int and one double, returning a String.
     * - Concatenates the integer and double values as a string.
     * @param num1 the first integer
     * @param num2 the second double
     * @return a concatenated string of `num1` and `num2`
     */
    public static String getValue(int num1, double num2) {
        return num1 + " and " + num2;
    }

    /**
     * Static method with one argument of type char returning a boolean.
     * - Checks if the given character is a vowel.
     * @param c the input character
     * @return true if `c` is a vowel, otherwise false
     */
    public static boolean getValue(char c) {
        return "AEIOUaeiou".indexOf(c) != -1;
    }

    // Non-static methods

    /**
     * Non-static method with no arguments returning a float.
     * - Returns a fixed float value.
     * @return 5.5f
     */
    public float getFloatValue() {
        return 5.5f;
    }

    /**
     * Non-static method with one String argument returning a char.
     * - Returns the first character of the given string.
     * @param str the input string
     * @return the first character of `str`, or space if `str` is empty
     */
    public char getCharValue(String str) {
        return str.isEmpty() ? ' ' : str.charAt(0);
    }

    /**
     * Non-static method with two arguments, a double and a boolean, returning an int.
     * - Returns 1 if the double is greater than 10.0 and the boolean is true; otherwise 0.
     * @param num the input double
     * @param flag the input boolean
     * @return 1 if `num > 10.0` and `flag` is true, otherwise 0
     */
    public int getIntValue(double num, boolean flag) {
        return (num > 10.0 && flag) ? 1 : 0;
    }

    /**
     * Non-static method with one argument of type int returning a double.
     * - Returns the square root of the given integer.
     * @param num the input integer
     * @return the square root of `num`
     */
    public double getDoubleValue(int num) {
        return Math.sqrt(num);
    }

    /**
     * Non-static method with two arguments, a char and a String, returning a String.
     * - Appends the character to the string and returns the result.
     * @param c the character to append
     * @param str the input string
     * @return the concatenated result of `str` and `c`
     */
    public String getStringValue(char c, String str) {
        return str + c;
    }

    public static void main(String[] args) {
        // Calling static overloaded methods
        System.out.println("Static getValue(): " + getValue()); // No arguments, int return
        System.out.println("Static getValue(int): " + getValue(7)); // One int argument, double return
        System.out.println("Static getValue(int, double): " + getValue(5, 3.2)); // Two arguments, String return
        System.out.println("Static getValue(char): " + getValue('e')); // One char argument, boolean return

        // Creating an object to call non-static overloaded methods
        OverloadingEx example = new OverloadingEx();

        // Calling non-static overloaded methods using the object
        System.out.println("Non-static getFloatValue(): " + example.getFloatValue()); // No arguments, float return
        System.out.println("Non-static getCharValue(String): " + example.getCharValue("Hello")); // One String argument, char return
        System.out.println("Non-static getIntValue(double, boolean): " + example.getIntValue(15.0, true)); // Two arguments, int return
        System.out.println("Non-static getDoubleValue(int): " + example.getDoubleValue(16)); // One int argument, double return
        System.out.println("Non-static getStringValue(char, String): " + example.getStringValue('X', "Test")); // Two arguments, String return

        // Alternative way to call non-static methods using an anonymous object
        System.out.println("Anonymous Non-static getStringValue(char, String): " + new OverloadingEx().getStringValue('Y', "Data")); // Using anonymous object
    }
}
