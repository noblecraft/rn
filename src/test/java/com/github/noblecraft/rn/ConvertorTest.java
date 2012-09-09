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

    @Test
    public void convertNumbersGreaterThan10LessThan100() {
        assertThat(Convertor.toRomanNumerals(11), is("XI"));
        assertThat(Convertor.toRomanNumerals(12), is("XII"));
        assertThat(Convertor.toRomanNumerals(13), is("XIII"));
        assertThat(Convertor.toRomanNumerals(14), is("XIV"));
        assertThat(Convertor.toRomanNumerals(15), is("XV"));
        assertThat(Convertor.toRomanNumerals(16), is("XVI"));
        assertThat(Convertor.toRomanNumerals(17), is("XVII"));
        assertThat(Convertor.toRomanNumerals(18), is("XVIII"));
        assertThat(Convertor.toRomanNumerals(19), is("XIX"));
        assertThat(Convertor.toRomanNumerals(20), is("XX"));
        assertThat(Convertor.toRomanNumerals(21), is("XXI"));
        assertThat(Convertor.toRomanNumerals(30), is("XXX"));
        assertThat(Convertor.toRomanNumerals(39), is("XXXIX"));
        assertThat(Convertor.toRomanNumerals(40), is("XL"));
        assertThat(Convertor.toRomanNumerals(55), is("LV"));
        assertThat(Convertor.toRomanNumerals(93), is("XCIII"));
        assertThat(Convertor.toRomanNumerals(94), is("XCIV"));
        assertThat(Convertor.toRomanNumerals(96), is("XCVI"));
        assertThat(Convertor.toRomanNumerals(97), is("XCVII"));
        assertThat(Convertor.toRomanNumerals(98), is("XCVIII"));
        assertThat(Convertor.toRomanNumerals(99), is("XCIX"));
    }

    @Test
    public void convertNumbersGreaterThan100LessThan1000() {
        assertThat(Convertor.toRomanNumerals(101), is("CI"));
        assertThat(Convertor.toRomanNumerals(109), is("CIX"));
        assertThat(Convertor.toRomanNumerals(110), is("CX"));
        assertThat(Convertor.toRomanNumerals(111), is("CXI"));
        assertThat(Convertor.toRomanNumerals(200), is("CC"));
        assertThat(Convertor.toRomanNumerals(300), is("CCC"));
        assertThat(Convertor.toRomanNumerals(400), is("CD"));
        assertThat(Convertor.toRomanNumerals(499), is("CDXCIX"));
        assertThat(Convertor.toRomanNumerals(510), is("DX"));
        assertThat(Convertor.toRomanNumerals(900), is("CM"));
        assertThat(Convertor.toRomanNumerals(990), is("CMXC"));
        assertThat(Convertor.toRomanNumerals(999), is("CMXCIX"));
    }

    @Test
    public void convertNumbersGreaterThan1000LessThan3000() {
        assertThat(Convertor.toRomanNumerals(1001), is("MI"));
        assertThat(Convertor.toRomanNumerals(1010), is("MX"));
        assertThat(Convertor.toRomanNumerals(1099), is("MXCIX"));
        assertThat(Convertor.toRomanNumerals(1100), is("MC"));
        assertThat(Convertor.toRomanNumerals(1200), is("MCC"));
        assertThat(Convertor.toRomanNumerals(1300), is("MCCC"));
        assertThat(Convertor.toRomanNumerals(1400), is("MCD"));
        assertThat(Convertor.toRomanNumerals(1500), is("MD"));
        assertThat(Convertor.toRomanNumerals(2000), is("MM"));
        assertThat(Convertor.toRomanNumerals(2100), is("MMC"));
        assertThat(Convertor.toRomanNumerals(2400), is("MMCD"));
        assertThat(Convertor.toRomanNumerals(2999), is("MMCMXCIX"));
    }

}
