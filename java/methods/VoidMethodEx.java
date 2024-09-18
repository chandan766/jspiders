/**
 * Void method performs a specific task without returning any value.
 */

 public class VoidMethodEx {

    /**
     * Static void method without formal arguments.
     * - Prints a simple message to the console.
     * - Does not take any input or return any output.
     */
    public static void m1() {
        System.out.println("Static Method: m1");
        return; // Not returning anything, return statement is optional
    }

    /**
     * Static void method without formal arguments.
     * - Prints another message to the console.
     * - No return statement required as it’s a void method.
     */
    public static void m2() {
        System.out.println("Static Method: m2");
        // No return statement needed
    }

    /**
     * Static void method with one formal argument.
     * - Prints the value of the passed string argument.
     * - Demonstrates how to pass arguments to a void method.
     */
    public static void m3(String name) {
        System.out.println("Static Method: m3 - " + name);
    }

    /**
     * Static void method with two formal arguments.
     * - Prints the sum of the two integer arguments.
     * - Demonstrates how to pass multiple arguments to a void method.
     */
    public static void m4(int a, int b) {
        System.out.println("Static Method: m4 - Sum = " + (a + b));
    }

    /**
     * Non-static void method without formal arguments.
     * - Prints a simple message.
     * - Demonstrates non-static method invocation using an object.
     */
    public void m5() {
        System.out.println("Non-static Method: m5");
    }

    /**
     * Non-static void method with one formal argument.
     * - Prints a message with the value of the passed integer.
     * - Demonstrates how to pass an argument to a non-static method.
     */
    public void m6(int number) {
        System.out.println("Non-static Method: m6 - Number: " + number);
    }

    /**
     * Non-static void method with two formal arguments.
     * - Prints the concatenated result of the two string arguments.
     * - Demonstrates non-static method with multiple arguments.
     */
    public void m7(String firstName, String lastName) {
        System.out.println("Non-static Method: m7 - Full Name: " + firstName + " " + lastName);
    }

    public static void main(String[] args) {
        // Calling static methods directly without creating an object
        m1(); // Static method without arguments
        m2(); // Static method without arguments
        m3("John Doe"); // Static method with one argument
        m4(5, 10); // Static method with two arguments

        // Creating an object to call non-static methods
        VoidMethodEx example = new VoidMethodEx();

        // Calling non-static methods using the object
        example.m5(); // Non-static method without arguments
        example.m6(42); // Non-static method with one argument
        example.m7("John", "Smith"); // Non-static method with two arguments

        // Alternative way to call non-static methods using an anonymous object
        new VoidMethodEx().m5(); // Calling non-static method directly from an anonymous object
    }
}

