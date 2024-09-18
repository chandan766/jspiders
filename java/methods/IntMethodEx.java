/**
 * This class demonstrates various types of methods return an `int` value,
 * including static and non-static methods, and how to call them.
 */
public class IntMethodEx {

    /**
     * Static method without arguments that returns an integer.
     * - This method simply returns a fixed integer value.
     * @return 10
     */
    public static int m1() {
        return 10;
    }

    /**
     * Static method with one formal argument that returns an integer.
     * - Accepts an integer argument and returns it.
     * @param a the integer to be returned
     * @return the input value `a`
     */
    public static int m2(int a) {
        return a;
    }

    /**
     * Static method with two formal arguments that returns the sum of two integers.
     * - Takes two integer arguments and returns their sum.
     * @param a the first integer
     * @param b the second integer
     * @return the sum of `a` and `b`
     */
    public static int m3(int a, int b) {
        return a + b;
    }

    /**
     * Static method with three formal arguments that returns the product of three integers.
     * - Takes three integer arguments and returns their product.
     * @param a the first integer
     * @param b the second integer
     * @param c the third integer
     * @return the product of `a`, `b`, and `c`
     */
    public static int m4(int a, int b, int c) {
        return a * b * c;
    }

    /**
     * Non-static method without arguments that returns a fixed integer.
     * - Returns a fixed integer value.
     * @return 50
     */
    public int m5() {
        return 50;
    }

    /**
     * Non-static method with one formal argument that returns the double of the input integer.
     * - Takes an integer argument and returns its double.
     * @param a the integer to be doubled
     * @return the doubled value of `a`
     */
    public int m6(int a) {
        return a * 2;
    }

    /**
     * Non-static method with two formal arguments that returns the difference between two integers.
     * - Takes two integer arguments and returns the difference.
     * @param a the first integer
     * @param b the second integer
     * @return the difference of `a` and `b`
     */
    public int m7(int a, int b) {
        return a - b;
    }

    /**
     * Non-static method with three formal arguments that returns the maximum of three integers.
     * - Compares three integer arguments and returns the largest.
     * @param a the first integer
     * @param b the second integer
     * @param c the third integer
     * @return the maximum value among `a`, `b`, and `c`
     */
    public int m8(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    public static void main(String[] args) {
        // Calling static methods directly without creating an object
        System.out.println("m1: " + m1()); // Static method without arguments
        System.out.println("m2: " + m2(15)); // Static method with one argument
        System.out.println("m3: " + m3(10, 20)); // Static method with two arguments
        System.out.println("m4: " + m4(2, 3, 4)); // Static method with three arguments

        // Creating an object to call non-static methods
        IntMethodEx example = new IntMethodEx();

        // Calling non-static methods using the object
        System.out.println("m5: " + example.m5()); // Non-static method without arguments
        System.out.println("m6: " + example.m6(25)); // Non-static method with one argument
        System.out.println("m7: " + example.m7(100, 55)); // Non-static method with two arguments
        System.out.println("m8: " + example.m8(10, 25, 5)); // Non-static method with three arguments

        // Alternative way to call non-static methods using an anonymous object
        System.out.println("Anonymous m6: " + new IntMethodEx().m6(45)); // Calling m6 using an anonymous object
    }
}
