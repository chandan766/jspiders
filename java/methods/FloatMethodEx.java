/**
 * This class demonstrates various types of methods that return a `float` value,
 * including static and non-static methods, and how to call them.
 */
public class FloatMethodEx {

    /**
     * Static method without arguments that returns a fixed float value.
     * - Returns a simple float value.
     * @return 5.5f
     */
    public static float m1() {
        return 5.5f;
    }

    /**
     * Static method with one formal argument that returns the square of the input.
     * - Accepts a float argument and returns its square.
     * @param a the float to be squared
     * @return the square of `a`
     */
    public static float m2(float a) {
        return a * a;
    }

    /**
     * Static method with two formal arguments that returns their average.
     * - Takes two float arguments and returns their average.
     * @param a the first float value
     * @param b the second float value
     * @return the average of `a` and `b`
     */
    public static float m3(float a, float b) {
        return (a + b) / 2;
    }

    /**
     * Static method with three formal arguments that returns the sum of the arguments.
     * - Takes three float arguments and returns their sum.
     * @param a the first float value
     * @param b the second float value
     * @param c the third float value
     * @return the sum of `a`, `b`, and `c`
     */
    public static float m4(float a, float b, float c) {
        return a + b + c;
    }

    /**
     * Non-static method without arguments that returns a fixed float value.
     * - Returns a predefined float value.
     * @return 12.75f
     */
    public float m5() {
        return 12.75f;
    }

    /**
     * Non-static method with one formal argument that returns the half of the input.
     * - Accepts a float argument and returns its half.
     * @param a the float value to be halved
     * @return half of `a`
     */
    public float m6(float a) {
        return a / 2;
    }

    /**
     * Non-static method with two formal arguments that returns the product of the two arguments.
     * - Takes two float arguments and returns their product.
     * @param a the first float value
     * @param b the second float value
     * @return the product of `a` and `b`
     */
    public float m7(float a, float b) {
        return a * b;
    }

    /**
     * Non-static method with three formal arguments that returns the largest of the three values.
     * - Compares three float values and returns the largest.
     * @param a the first float value
     * @param b the second float value
     * @param c the third float value
     * @return the largest of `a`, `b`, and `c`
     */
    public float m8(float a, float b, float c) {
        return Math.max(a, Math.max(b, c));
    }

    public static void main(String[] args) {
        // Calling static methods directly without creating an object
        System.out.println("m1: " + m1()); // Static method without arguments
        System.out.println("m2: " + m2(4.0f)); // Static method with one argument
        System.out.println("m3: " + m3(3.5f, 6.5f)); // Static method with two arguments
        System.out.println("m4: " + m4(1.1f, 2.2f, 3.3f)); // Static method with three arguments

        // Creating an object to call non-static methods
        FloatMethodEx example = new FloatMethodEx();

        // Calling non-static methods using the object
        System.out.println("m5: " + example.m5()); // Non-static method without arguments
        System.out.println("m6: " + example.m6(20.0f)); // Non-static method with one argument
        System.out.println("m7: " + example.m7(5.5f, 1.5f)); // Non-static method with two arguments
        System.out.println("m8: " + example.m8(2.5f, 7.0f, 4.3f)); // Non-static method with three arguments

        // Alternative way to call non-static methods using an anonymous object
        System.out.println("Anonymous m6: " + new FloatMethodEx().m6(30.0f)); // Calling m6 using an anonymous object
    }
}
