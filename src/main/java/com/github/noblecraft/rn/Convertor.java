package com.github.noblecraft.rn;

import java.util.HashMap;
import java.util.Map;

/**
 * User: dzhu
 * Date: 8/09/12
 * Time: 12:32 PM
 */
public final class Convertor {

    private static final Map<Integer, String> ROMAN_NUMERALS = new HashMap<Integer, String>();

    static {
        ROMAN_NUMERALS.put(1, "I");
        ROMAN_NUMERALS.put(5, "V");
        ROMAN_NUMERALS.put(10, "X");
        ROMAN_NUMERALS.put(50, "L");
        ROMAN_NUMERALS.put(100, "C");
        ROMAN_NUMERALS.put(500, "D");
        ROMAN_NUMERALS.put(1000, "M");
    }

    public static String toRomanNumerals(int number) {
        return ROMAN_NUMERALS.get(number);
    }

}
