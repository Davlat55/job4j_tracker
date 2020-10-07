package ru.job4j.oop.condition;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class MaxTest {

    @Test
    public void max() {
        int result = Max.max(5, 1);
        assertThat(result, is(5));
    }

    @Test
    public void testMax() {
        int result = Max.max(3, 1, 7);
        assertThat(result, is(7));
    }

    @Test
    public void testMax1() {
        int result = Max.max(3, 1, 7, 9);
        assertThat(result, is(9));
    }
}