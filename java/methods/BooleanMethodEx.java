/**
 * This class demonstrates various types of methods that return a `boolean` value,
 * including static and non-static methods, and how to call them.
 */
public class BooleanMethodEx {

    /**
     * Static method without arguments that returns a fixed boolean value.
     * - Returns true, representing a constant boolean value.
     * @return true
     */
    public static boolean m1() {
        return true;
    }

    /**
     * Static method with one formal argument that checks if the number is even.
     * - Accepts an integer and returns true if the number is even, false otherwise.
     * @param a the integer to check
     * @return true if `a` is even, false if odd
     */
    public static boolean m2(int a) {
        return a % 2 == 0;
    }

    /**
     * Static method with two formal arguments that checks if both numbers are positive.
     * - Takes two integers and returns true if both are positive, false otherwise.
     * @param a the first integer
     * @param b the second integer
     * @return true if both `a` and `b` are positive, false otherwise
     */
    public static boolean m3(int a, int b) {
        return a > 0 && b > 0;
    }

    /**
     * Static method with three formal arguments that checks if at least one number is negative.
     * - Takes three integers and returns true if any one of them is negative.
     * @param a the first integer
     * @param b the second integer
     * @param c the third integer
     * @return true if any of `a`, `b`, or `c` is negative, false otherwise
     */
    public static boolean m4(int a, int b, int c) {
        return a < 0 || b < 0 || c < 0;
    }

    /**
     * Non-static method without arguments that returns a fixed boolean value.
     * - Returns false, representing a constant boolean value.
     * @return false
     */
    public boolean m5() {
        return false;
    }

    /**
     * Non-static method with one formal argument that checks if a number is positive.
     * - Accepts a float argument and returns true if it's positive.
     * @param a the float to check
     * @return true if `a` is positive, false otherwise
     */
    public boolean m6(float a) {
        return a > 0;
    }

    /**
     * Non-static method with two formal arguments that checks if both floats are non-zero.
     * - Takes two float values and returns true if neither is zero.
     * @param a the first float value
     * @param b the second float value
     * @return true if both `a` and `b` are non-zero, false otherwise
     */
    public boolean m7(float a, float b) {
        return a != 0 && b != 0;
    }

    /**
     * Non-static method with three formal arguments that checks if all boolean values are true.
     * - Takes three boolean values and returns true if all are true.
     * @param a the first boolean value
     * @param b the second boolean value
     * @param c the third boolean value
     * @return true if `a`, `b`, and `c` are all true, false otherwise
     */
    public boolean m8(boolean a, boolean b, boolean c) {
        return a && b && c;
    }

    public static void main(String[] args) {
        // Calling static methods directly without creating an object
        System.out.println("m1: " + m1()); // Static method without arguments
        System.out.println("m2: " + m2(4)); // Static method with one argument
        System.out.println("m3: " + m3(3, 6)); // Static method with two arguments
        System.out.println("m4: " + m4(1, -2, 3)); // Static method with three arguments

        // Creating an object to call non-static methods
        BooleanMethodEx example = new BooleanMethodEx();

        // Calling non-static methods using the object
        System.out.println("m5: " + example.m5()); // Non-static method without arguments
        System.out.println("m6: " + example.m6(5.5f)); // Non-static method with one argument
        System.out.println("m7: " + example.m7(0.5f, 1.5f)); // Non-static method with two arguments
        System.out.println("m8: " + example.m8(true, false, true)); // Non-static method with three arguments

        // Alternative way to call non-static methods using an anonymous object
        System.out.println("Anonymous m6: " + new BooleanMethodEx().m6(-10.0f)); // Calling m6 using an anonymous object
    }
}
