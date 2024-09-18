/**
 * This class demonstrates various types of methods that return a `byte` value,
 * including static and non-static methods, and how to call them.
 */
public class ByteMethodEx {

    /**
     * Static method without arguments that returns a fixed byte value.
     * - Returns 10, representing a constant byte value.
     * @return 10
     */
    public static byte m1() {
        return 10;
    }

    /**
     * Static method with one formal argument that returns the byte value of the argument.
     * - Accepts an integer and returns its byte representation.
     * @param a the integer to be cast to byte
     * @return the byte value of `a`
     */
    public static byte m2(int a) {
        return (byte) a;
    }

    /**
     * Static method with two formal arguments that adds two byte values.
     * - Accepts two integers, converts them to byte, and returns their sum as a byte.
     * @param a the first integer
     * @param b the second integer
     * @return the byte sum of `a` and `b`
     */
    public static byte m3(int a, int b) {
        return (byte) (a + b);
    }

    /**
     * Static method with three formal arguments that returns the smallest byte value.
     * - Takes three integers, converts them to bytes, and returns the smallest one.
     * @param a the first integer
     * @param b the second integer
     * @param c the third integer
     * @return the smallest byte value among `a`, `b`, and `c`
     */
    public static byte m4(int a, int b, int c) {
        byte ba = (byte) a;
        byte bb = (byte) b;
        byte bc = (byte) c;
        return (byte) Math.min(ba, Math.min(bb, bc));
    }

    /**
     * Non-static method without arguments that returns a fixed byte value.
     * - Returns -5, representing a constant byte value.
     * @return -5
     */
    public byte m5() {
        return -5;
    }

    /**
     * Non-static method with one formal argument that negates the byte value.
     * - Accepts a byte and returns its negative value.
     * @param a the byte to negate
     * @return the negated byte value of `a`
     */
    public byte m6(byte a) {
        return (byte) -a;
    }

    /**
     * Non-static method with two formal arguments that multiplies two byte values.
     * - Takes two byte values and returns their product as a byte.
     * @param a the first byte value
     * @param b the second byte value
     * @return the byte product of `a` and `b`
     */
    public byte m7(byte a, byte b) {
        return (byte) (a * b);
    }

    /**
     * Non-static method with three formal arguments that returns the average of three bytes.
     * - Takes three byte values and returns their average as a byte.
     * @param a the first byte value
     * @param b the second byte value
     * @param c the third byte value
     * @return the average byte value of `a`, `b`, and `c`
     */
    public byte m8(byte a, byte b, byte c) {
        return (byte) ((a + b + c) / 3);
    }

    public static void main(String[] args) {
        // Calling static methods directly without creating an object
        System.out.println("m1: " + m1()); // Static method without arguments
        System.out.println("m2: " + m2(130)); // Static method with one argument
        System.out.println("m3: " + m3(50, 60)); // Static method with two arguments
        System.out.println("m4: " + m4(10, -20, 30)); // Static method with three arguments

        // Creating an object to call non-static methods
        ByteMethodEx example = new ByteMethodEx();

        // Calling non-static methods using the object
        System.out.println("m5: " + example.m5()); // Non-static method without arguments
        System.out.println("m6: " + example.m6((byte) 25)); // Non-static method with one argument
        System.out.println("m7: " + example.m7((byte) 5, (byte) 6)); // Non-static method with two arguments
        System.out.println("m8: " + example.m8((byte) 3, (byte) 4, (byte) 5)); // Non-static method with three arguments

        // Alternative way to call non-static methods using an anonymous object
        System.out.println("Anonymous m6: " + new ByteMethodEx().m6((byte) 100)); // Calling m6 using an anonymous object
    }
}
