package ru.job4j.oop.condition;

import static org.hamcrest.Matchers.closeTo;
import static org.junit.Assert.assertThat;
import junit.framework.TestCase;
import org.junit.Test;

public class TrianglTest extends TestCase {

    public void testArea() {

    }

    @Test
    public void testPeriod() {
        PointOOP a = new PointOOP(0, 0);
        PointOOP b = new PointOOP(4, 0);
        PointOOP c = new PointOOP(0, 4);
        Triangl triangle = new Triangl(a, b, c);
        double rsl = triangle.area();
        assertThat(rsl, closeTo(8, 0.001));
    }
}