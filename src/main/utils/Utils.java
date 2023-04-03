package main.utils;

import java.util.Random;

/**
 * A utility class for common functions used throughout the program.

 * @author Xiaowen Zhou

 * @version 1.0

 * @see Utils
 */
public class Utils {
    /**
     * Generates a random integer within a given range.
     * @param low  the lower bound of the range
     * @param high the upper bound of the range
     * @return a random integer within the given range
     */
    public static int nextID(int low, int high) {
        Random r = new Random();
        return (r.nextInt(high - low) + low);
    }

    /**
     * Determines whether a given string falls within a specified length range.
     * @param str       the string to check the length of
     * @param minLength the minimum allowed length
     * @param maxLength the maximum allowed length
     * @return true if the length of the string falls within the specified range, false otherwise
     */
    public static boolean isValidStringLength(String str, int minLength, int maxLength) {
        if (str == null) {
            return false;
        }
        int length = str.length();
        return length >= minLength && length <= maxLength;
    }

    /**
     * Determines whether a given integer falls within a specified range.
     * @param value the integer to check
     * @param min   the minimum allowed value
     * @param max   the maximum allowed value
     * @return true if the integer falls within the specified range, false otherwise
     */
    public static boolean isValidIntRange(int value, int min, int max) {
        return value >= min && value <= max;
    }
}