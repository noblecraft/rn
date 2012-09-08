package com.github.noblecraft.rn;

import org.junit.Test;

import java.util.Iterator;
import java.util.Map;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * User: dzhu
 * Date: 8/09/12
 * Time: 12:37 PM
 */
public class ConvertorTest {

    @Test
    public void straightConvertionsToRomanNumerals() {
        assertThat(Convertor.toRomanNumerals(1), is("I"));
        assertThat(Convertor.toRomanNumerals(5), is("V"));
        assertThat(Convertor.toRomanNumerals(10), is("X"));
        assertThat(Convertor.toRomanNumerals(50), is("L"));
        assertThat(Convertor.toRomanNumerals(100), is("C"));
        assertThat(Convertor.toRomanNumerals(500), is("D"));
        assertThat(Convertor.toRomanNumerals(1000), is("M"));
    }

    @Test
    public void convertNumbersTo10ThatRequireRepetition() {
        assertThat(Convertor.toRomanNumerals(2), is("II"));
        assertThat(Convertor.toRomanNumerals(3), is("III"));
        assertThat(Convertor.toRomanNumerals(6), is("VI"));
        assertThat(Convertor.toRomanNumerals(7), is("VII"));
        assertThat(Convertor.toRomanNumerals(8), is("VIII"));
    }

    @Test
    public void convertNumbersTo10ThatRequireSubtraction() {
        assertThat(Convertor.toRomanNumerals(4), is("IV"));
        assertThat(Convertor.toRomanNumerals(9), is("IX"));
    }

}
