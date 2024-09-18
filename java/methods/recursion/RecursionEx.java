package recursion;
/**
 * This class demonstrates recursion in Java through various methods.
 * Recursion is a technique where a method calls itself to solve a problem.
 * Each method includes a base case and a recursive case.
 */
public class RecursionEx {

    /**
     * Recursive method to calculate the factorial of a number.
     * - Base case: returns 1 if the number is 0.
     * - Recursive case: multiplies the number by the factorial of (number - 1).
     * @param n the input number
     * @return the factorial of `n`
     */
    public static long factorial(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    /**
     * Recursive method to calculate the nth Fibonacci number.
     * - Base cases: returns `n` if `n` is 0 or 1.
     * - Recursive case: returns the sum of the (n-1)th and (n-2)th Fibonacci numbers.
     * @param n the index of the Fibonacci number
     * @return the nth Fibonacci number
     */
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    /**
     * Recursive method to reverse a string.
     * - Base case: returns the string if it is empty or has one character.
     * - Recursive case: returns the last character plus the reverse of the rest of the string.
     * @param str the input string
     * @return the reversed string
     */
    public static String reverseString(String str) {
        if (str.isEmpty()) {
            return str;
        } else {
            return reverseString(str.substring(1)) + str.charAt(0);
        }
    }

    /**
     * Recursive method to calculate the sum of an array of integers.
     * - Base case: returns 0 if the array is empty.
     * - Recursive case: adds the first element of the array to the sum of the rest of the array.
     * @param arr the input array
     * @param index the current index
     * @return the sum of the elements in the array
     */
    public static int sumArray(int[] arr, int index) {
        if (index >= arr.length) {
            return 0;
        } else {
            return arr[index] + sumArray(arr, index + 1);
        }
    }

    /**
     * Recursive method to find the greatest common divisor (GCD) of two numbers using Euclid's algorithm.
     * - Base case: returns `b` if `a` is 0.
     * - Recursive case: returns the GCD of `b` and the remainder of `a` divided by `b`.
     * @param a the first number
     * @param b the second number
     * @return the GCD of `a` and `b`
     */
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }

    public static void main(String[] args) {
        // Demonstrating recursive methods

        // Factorial of 5
        System.out.println("Factorial of 5: " + factorial(5));

        // 10th Fibonacci number
        System.out.println("Fibonacci of 10: " + fibonacci(10));

        // Reverse of "hello"
        System.out.println("Reverse of 'hello': " + reverseString("hello"));

        // Sum of array {1, 2, 3, 4, 5}
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("Sum of array: " + sumArray(numbers, 0));

        // GCD of 48 and 18
        System.out.println("GCD of 48 and 18: " + gcd(48, 18));
    }
}
