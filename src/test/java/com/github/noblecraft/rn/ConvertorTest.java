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
    }

}
