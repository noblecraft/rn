package com.github.noblecraft.rn;

import com.google.common.base.Optional;

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

        final Bounds<RomanNumeral> bounds = bounds(number);

        if (requiresSubtracting(number, bounds)) {
            out.append("I").append(bounds.getUpper().get().getSymbol());
        } else {
            out.append(bounds.getLower().get().getSymbol());
            repeat(bounds.getLower().get(), number, out);
        }

        return out.toString();

    }

    private static boolean requiresSubtracting(int number, Bounds<RomanNumeral> bounds) {

        if (bounds.getLower().get().getSymbol().equals("I")) {
            return number - bounds.getLower().get().getNumber() > 2;
        }

        return number - bounds.getLower().get().getNumber() > 3;

    }

    private static void repeat(RomanNumeral base, int number, StringBuilder builder) {
        for (int i = 0; i < number - base.getNumber(); i++) {
            builder.append(ROMAN_NUMERALS[0].getSymbol());
        }
    }

    private static Bounds<RomanNumeral> bounds(Integer number) {

        for (int i = 0; i < ROMAN_NUMERALS.length - 1; i++) {
            if (ROMAN_NUMERALS[i].getNumber() == number) {
                return Bounds.bounded(ROMAN_NUMERALS[i], ROMAN_NUMERALS[i]);
            } else if (ROMAN_NUMERALS[i + 1].getNumber() > number) {
                return Bounds.bounded(ROMAN_NUMERALS[i], ROMAN_NUMERALS[i + 1]);
            }
        }

        return Bounds.noUpperBound(ROMAN_NUMERALS[ROMAN_NUMERALS.length - 1]);

    }

    private static class Bounds<T> {

        private final Optional<T> lower;
        private final Optional<T> upper;

        public Bounds(Optional<T> lower, Optional<T> upper) {
            this.lower = lower;
            this.upper = upper;
        }

        public Optional<T> getLower() {
            return lower;
        }

        public Optional<T> getUpper() {
            return upper;
        }

        public static <T>Bounds<T> bounded(T lower, T upper) {
            return new Bounds<T>(Optional.of(lower), Optional.of(upper));
        }

        public static <T>Bounds<T> noUpperBound(T lower) {
            return new Bounds<T>(Optional.of(lower), Optional.<T>absent());
        }

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
