package com.github.noblecraft.rn;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * User: dzhu
 * Date: 8/09/12
 * Time: 9:35 PM
 */
public class NumberUtilsTest {

    @Test
    public void testSplitNumbers0To9() {

        testSplitNumbers(0, 0);
        testSplitNumbers(1, 1);
        testSplitNumbers(9, 9);

    }

    @Test
    public void testSplitNumbersGreaterThan10() {

        testSplitNumbers(10, 10, 0);
        testSplitNumbers(11, 10, 1);
        testSplitNumbers(12, 10, 2);
        testSplitNumbers(13, 10, 3);
        testSplitNumbers(20, 20, 0);
        testSplitNumbers(100, 100, 0, 0);
        testSplitNumbers(101, 100, 0, 1);
        testSplitNumbers(110, 100, 10, 0);
        testSplitNumbers(111, 100, 10, 1);
        testSplitNumbers(1000, 1000, 0, 0, 0);
        testSplitNumbers(1111, 1000, 100, 10, 1);

    }

    private void testSplitNumbers(int number, int...expected) {

        final Integer[] split = NumberUtils.split(number);

        assertThat(split.length, is(expected.length));

        for(int i = 0; i < expected.length; i++) {
            assertThat(split[i], is(expected[i]));
        }

    }

}
