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
        int z1 = 1;
        int z2 = 1;
        double out = PointOOP.distance(x2, x1, y2, y1, z2,z1);
       Assert.assertEquals(expected, out, 0.01);
    }

}