package main.utils;

import java.util.Random;

public class Utils {

    public static int nextID(int low, int high) {
        Random r = new Random();
        return (r.nextInt(high - low) + low);
    }

    public static boolean isValidStringLength(String str, int minLength, int maxLength) {
        if (str == null) {
            return false;
        }
        int length = str.length();
        return length >= minLength && length <= maxLength;
    }

    public static boolean isValidIntRange(int value, int min, int max) {
        return value >= min && value <= max;
    }
}