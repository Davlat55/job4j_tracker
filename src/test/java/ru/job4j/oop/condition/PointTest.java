package ru.job4j.oop.condition;

import org.junit.Test;
import org.junit.Assert;

public class PointTest {

    @Test
    public void distance() {
        int expected = 2;
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double out = Point.distance(x1, y1, x2, y2);
       Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void distance3d() {

    }
}