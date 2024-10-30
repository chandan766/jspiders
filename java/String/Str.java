/*
 * The Str class provides a collection of utility methods for string manipulation.
 * It includes methods to compress and decompress strings, reverse strings, encode 
 * and decode text with Caesar cipher shifts, convert strings to uppercase and lowercase,
 * capitalize the first letter of each word, reverse word order, and check if a string 
 * is a palindrome. These methods are commonly used in text processing and encoding/decoding tasks.
 */

public class Str {
    /**
     * Compresses a string by converting consecutive duplicate characters into their count.
     * Example: Input: "aaabbc", Output: "3a2bc"
     */
    public static String compress(String s) {
        char[] c = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        int count = 1;
        char pre = c[0];
        for (int i = 1; i <= c.length; i++) {
            while (i < c.length && pre == c[i]) {
                count++;
                i++;
            }
            if (count > 1) {
                sb.append(count);
                count = 1;
            }
            sb.append(pre);
            pre = (i == c.length) ? c[i - 1] : c[i];
        }
        return sb.toString();
    }

    /**
     * Decompresses a string where numbers indicate the count of the following character.
     * Example: Input: "3a2bc", Output: "aaabbc"
     */
    public static String decompress(String s) {
        char[] c = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        int count = 0;
        String num = "";
        for (int i = 0; i < c.length; i++) {
            while (c[i] >= '1' && c[i] <= '9') {
                num += c[i];
                i++;
            }
            if (num.length() > 0) {
                count = Integer.parseInt(num);
                num = "";
            } else {
                sb.append(c[i]);
            }
            while (count > 0) {
                sb.append(c[i]);
                count--;
            }
        }
        return sb.toString();
    }

    /**
     * Reverses the given string.
     * Example: Input: "hello", Output: "olleh"
     */
    public static String reverse(String s) {
        char[] c = s.toCharArray();
        char[] rev = new char[c.length];
        int j = 0, i = c.length - 1;
        while (i >= 0) {
            rev[j++] = c[i--];
        }
        return new String(rev);
    }

    /**
     * Encodes a string by shifting each character by a specified number of letters in the alphabet.
     * Example: Input: "abc", l = 2, Output: "cde"
     */
    public static String encode(String s, int l) {
        char[] arr = s.toCharArray();
        char[] letters = new char[26];
        int j = 0;
        for (char i = 'a'; i <= 'z'; i++) {
            letters[j++] = i;
        }
        for (int i = 0; i < arr.length; i++) {
            char c = arr[i];
            arr[i] = letters[((c - 97) + l) % 26];
        }
        return new String(arr);
    }

    /**
     * Decodes a string by reversing the Caesar cipher shift applied during encoding.
     * Example: Input: "cde", l = 2, Output: "abc"
     */
    public static String decode(String s, int l) {
        char[] arr = s.toCharArray();
        char[] letters = new char[26];
        int j = 0;
        for (char i = 'a'; i <= 'z'; i++) {
            letters[j++] = i;
        }
        for (int i = 0; i < arr.length; i++) {
            char c = arr[i];
            int exp = ((c - 97) - l) % 26;
            arr[i] = letters[exp >= 0 ? exp : 26 + exp];
        }
        return new String(arr);
    }

    /**
     * Converts all characters in a string to uppercase.
     * Example: Input: "hello", Output: "HELLO"
     */
    public static String upperCase(String s) {
        char[] c = s.toCharArray();
        for (int i = 0; i < c.length; i++) {
            int n = c[i] - 32;
            if (c[i] >= 'a' && c[i] <= 'z') c[i] = (char) n;
        }
        return new String(c);
    }

    /**
     * Converts all characters in a string to lowercase.
     * Example: Input: "HELLO", Output: "hello"
     */
    public static String lowerCase(String s) {
        char[] c = s.toCharArray();
        for (int i = 0; i < c.length; i++) {
            int n = c[i] + 32;
            if (c[i] >= 'A' && c[i] <= 'Z') c[i] = (char) n;
        }
        return new String(c);
    }

    /**
     * Capitalizes the first letter of each word in a string.
     * Example: Input: "hello world", Output: "Hello World"
     */
    public static String initCap(String s) {
        char[] c = s.toCharArray();
        for (int i = 0; i < c.length; i++) {
            int n = c[i] - 32;
            if (c[i] >= 'a' && c[i] <= 'z') {
                if (i == 0 || c[i - 1] == ' ') c[i] = (char) n;
            }
        }
        return new String(c);
    }

    /**
     * Reverses the order of words in a string without changing the characters in each word.
     * Example: Input: "hello world", Output: "world hello"
     */
    public static String wordOrderReverse(String s) {
        String s1 = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            String t = "";
            while (i >= 0 && s.charAt(i) != ' ') t += s.charAt(i--);
            int len = t.length() - 1;
            while (len >= 0) s1 += t.charAt(len--);
            if (i > 0) s1 += " ";
        }
        return s1;
    }

    /**
     * Checks if a string is a palindrome, ignoring case.
     * Example: Input: "Madam", Output: true
     */
    public static boolean isPalindrome(String s) {
        s = s.toLowerCase();
        char[] arr = s.toCharArray();
        int i = 0, j = arr.length - 1;
        while (j >= 0) {
            if (arr[i++] != arr[j--]) return false;
        }
        return true;
    }
}
