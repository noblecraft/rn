package com.github.noblecraft.rn;

/**
 * User: dzhu
 * Date: 8/09/12
 * Time: 9:34 PM
 */
public class NumberUtils {

    public static Integer[] split(Integer number) {
        final char[] chars = number.toString().toCharArray();
        final Integer[] out = new Integer[chars.length];
        for (int i = 0; i < chars.length; i++) {
            out[i] = Character.digit(chars[i], 10) * (int)(Math.pow(10.0, chars.length - i - 1));
        }
        return out;
    }

}
