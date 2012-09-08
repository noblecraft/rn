package com.github.noblecraft.rn;

/**
 * User: dzhu
 * Date: 8/09/12
 * Time: 12:32 PM
 */
public final class Convertor {

    private static final RomanNumeral[] ROMAN_NUMERALS = new RomanNumeral[] {
        new RomanNumeral("I", 1), // 0
        new RomanNumeral("V", 5), // 1
        new RomanNumeral("X", 10), // 2
        new RomanNumeral("L", 50), // 3
        new RomanNumeral("C", 100), // 4
        new RomanNumeral("D", 500), // 5
        new RomanNumeral("M", 1000) // 6
    };

    public static String toRomanNumerals(int number) {

        final StringBuilder out = new StringBuilder();

        final RomanNumeral base = findBase(number);

        out.append(base.getSymbol());

        repeat(base, number, out);

        return out.toString();

    }

    private static void repeat(RomanNumeral base, int number, StringBuilder builder) {
        for (int i = 0; i < number - base.getNumber(); i++) {
            builder.append(ROMAN_NUMERALS[0].getSymbol());
        }
    }

    private static RomanNumeral findBase(Integer max) {

        for (int i = 0; i < ROMAN_NUMERALS.length - 1; i++) {
            if (ROMAN_NUMERALS[i + 1].getNumber() > max) {
                return ROMAN_NUMERALS[i];
            }
        }

        return ROMAN_NUMERALS[ROMAN_NUMERALS.length - 1];

    }

    private static class RomanNumeral {

        private final String symbol;
        private final int number;

        public RomanNumeral(String symbol, int number) {
            this.symbol = symbol;
            this.number = number;
        }

        public String getSymbol() {
            return symbol;
        }

        public int getNumber() {
            return number;
        }

    }

}
