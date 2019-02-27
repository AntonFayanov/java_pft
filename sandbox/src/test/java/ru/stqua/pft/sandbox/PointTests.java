package ru.stqua.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTests {
    @Test
    public void pointTest() {
        Point p1 = new Point(0, 1);
        Point p2 = new Point(0, 3);
        Assert.assertEquals(p1.distance(p2),2.0);
    }
}
