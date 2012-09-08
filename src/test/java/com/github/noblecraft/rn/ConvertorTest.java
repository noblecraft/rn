package com.github.noblecraft.rn;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * User: dzhu
 * Date: 8/09/12
 * Time: 12:37 PM
 */
public class ConvertorTest {

    @Test
    public void convertToRomanNumerals() {
        assertThat(Convertor.toRomanNumerals(1), is("I"));
        assertThat(Convertor.toRomanNumerals(5), is("V"));
        assertThat(Convertor.toRomanNumerals(10), is("X"));
        assertThat(Convertor.toRomanNumerals(50), is("L"));
        assertThat(Convertor.toRomanNumerals(100), is("C"));
        assertThat(Convertor.toRomanNumerals(500), is("D"));
        assertThat(Convertor.toRomanNumerals(1000), is("M"));
    }

}
