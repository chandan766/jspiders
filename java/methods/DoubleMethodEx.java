/**
 * This class demonstrates various types of methods that return a `double` value,
 * including static and non-static methods, and how to call them.
 */
public class DoubleMethodEx {

    /**
     * Static method without arguments that returns a fixed double value.
     * - Returns a simple double value.
     * @return 10.5
     */
    public static double m1() {
        return 10.5;
    }

    /**
     * Static method with one formal argument that returns the square of the input.
     * - Accepts a double argument and returns its square.
     * @param a the double to be squared
     * @return the square of `a`
     */
    public static double m2(double a) {
        return a * a;
    }

    /**
     * Static method with two formal arguments that returns their average.
     * - Takes two double arguments and returns their average.
     * @param a the first double value
     * @param b the second double value
     * @return the average of `a` and `b`
     */
    public static double m3(double a, double b) {
        return (a + b) / 2;
    }

    /**
     * Static method with three formal arguments that returns the sum of the arguments.
     * - Takes three double arguments and returns their sum.
     * @param a the first double value
     * @param b the second double value
     * @param c the third double value
     * @return the sum of `a`, `b`, and `c`
     */
    public static double m4(double a, double b, double c) {
        return a + b + c;
    }

    /**
     * Non-static method without arguments that returns a fixed double value.
     * - Returns a predefined double value.
     * @return 25.75
     */
    public double m5() {
        return 25.75;
    }

    /**
     * Non-static method with one formal argument that returns the half of the input.
     * - Accepts a double argument and returns its half.
     * @param a the double value to be halved
     * @return half of `a`
     */
    public double m6(double a) {
        return a / 2;
    }

    /**
     * Non-static method with two formal arguments that returns the product of the two arguments.
     * - Takes two double arguments and returns their product.
     * @param a the first double value
     * @param b the second double value
     * @return the product of `a` and `b`
     */
    public double m7(double a, double b) {
        return a * b;
    }

    /**
     * Non-static method with three formal arguments that returns the smallest of the three values.
     * - Compares three double values and returns the smallest.
     * @param a the first double value
     * @param b the second double value
     * @param c the third double value
     * @return the smallest of `a`, `b`, and `c`
     */
    public double m8(double a, double b, double c) {
        return Math.min(a, Math.min(b, c));
    }

    public static void main(String[] args) {
        // Calling static methods directly without creating an object
        System.out.println("m1: " + m1()); // Static method without arguments
        System.out.println("m2: " + m2(3.5)); // Static method with one argument
        System.out.println("m3: " + m3(4.5, 8.5)); // Static method with two arguments
        System.out.println("m4: " + m4(1.1, 2.2, 3.3)); // Static method with three arguments

        // Creating an object to call non-static methods
        DoubleMethodEx example = new DoubleMethodEx();

        // Calling non-static methods using the object
        System.out.println("m5: " + example.m5()); // Non-static method without arguments
        System.out.println("m6: " + example.m6(10.0)); // Non-static method with one argument
        System.out.println("m7: " + example.m7(5.5, 2.0)); // Non-static method with two arguments
        System.out.println("m8: " + example.m8(3.3, 7.7, 1.1)); // Non-static method with three arguments

        // Alternative way to call non-static methods using an anonymous object
        System.out.println("Anonymous m6: " + new DoubleMethodEx().m6(20.0)); // Calling m6 using an anonymous object
    }
}
