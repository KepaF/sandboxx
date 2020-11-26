package ru.ssau.tk._KEPAF_._sandboxx_;

import org.testng.annotations.Test;

import static org.testng.Assert.*;
import static ru.ssau.tk._KEPAF_._sandboxx_.Points.equalsApproximately;

public class PointsTest {

    @Test
    public void testSum() {
        assertTrue(equalsApproximately(Points.sum(new Point(5.0, 5.0, 5.0), new Point(4.0, 4.0, 4.0)), new Point(9.0, 9.0, 9.0)));
        assertTrue(equalsApproximately(Points.sum(new Point(0.0, 0.0, 0.0), new Point(0.0, 0.0, 0.0)), new Point(0.0, 0.0, 0.0)));
        assertFalse(equalsApproximately(Points.sum(new Point(5.0, 5.0, 5.0), new Point(4.0, 4.0, 4.0)), new Point(10.0, 10.0, 19.0)));
    }

    @Test
    public void testSubtract() {
        assertTrue(equalsApproximately(Points.subtract(new Point(5.0, 5.0, 5.0), new Point(4.0, 4.0, 4.0)), new Point(1.0, 1.0, 1.0)));
        assertTrue(equalsApproximately(Points.subtract(new Point(0.0, 0.0, 0.0), new Point(0.0, 0.0, 0.0)), new Point(0.0, 0.0, 0.0)));
        assertFalse(equalsApproximately(Points.subtract(new Point(5.0, 5.0, 5.0), new Point(4.0, 4.0, 4.0)), new Point(2.0, 3.0, 4.0)));
    }

    @Test
    public void testMultiply() {
        assertTrue(equalsApproximately(Points.multiply(new Point(5.0, 5.0, 5.0), new Point(4.0, 4.0, 4.0)), new Point(20.0, 20.0, 20.0)));
        assertTrue(equalsApproximately(Points.multiply(new Point(0.0, 0.0, 0.0), new Point(0.0, 0.0, 0.0)), new Point(0.0, 0.0, 0.0)));
        assertFalse(equalsApproximately(Points.multiply(new Point(5.0, 5.0, 5.0), new Point(4.0, 4.0, 4.0)), new Point(2.0, 3.0, 4.0)));
    }


    @Test
    public void testDivide() {
        assertTrue(equalsApproximately(Points.divide(new Point(50.0, 50.0, 50.0), new Point(4.0, 4.0, 4.0)), new Point(12.5, 12.5, 12.5)));
        assertTrue(equalsApproximately(Points.divide(new Point(1.0, 1.0, 1.0), new Point(1.0, 1.0, 1.0)), new Point(1.0, 1.0, 1.0)));
        assertFalse(equalsApproximately(Points.divide(new Point(5.0, 5.0, 5.0), new Point(4.0, 4.0, 4.0)), new Point(2.0, 3.0, 4.0)));
    }

    @Test
    public void testEnlarge() {
        assertTrue(equalsApproximately(Points.enlarge(new Point(5.0, 5.0, 5.0), 4), new Point(20.0, 20.0, 20.0)));
        assertTrue(equalsApproximately(Points.enlarge(new Point(0.0, 0.0, 0.0), 4), new Point(0.0, 0.0, 0.0)));
        assertFalse(equalsApproximately(Points.enlarge(new Point(5.0, 5.0, 5.0), 4), new Point(2.0, 3.0, 4.0)));
    }


    @Test
    public void testLength() {
        assertEquals(Points.length(new Point(5.0, 4.0, 8.0)), Math.sqrt(105), 0.00005);
        assertEquals(Points.length(new Point(1.0, 1.0, 1.0)), Math.sqrt(3), 0.00005);
        assertNotEquals(Points.length(new Point(1.0, 1.0, 1.0)), Math.sqrt(1), 0.00005);
    }

    @Test
    public void testOpposite() {
        assertTrue(Points.equalsApproximately(Points.opposite(new Point(1.0, 1.5, -0.5)), new Point(-1.0, -1.5, 0.5)));
        assertTrue(Points.equalsApproximately(Points.opposite(new Point(2.0, 15.8, -6.0)), new Point(-2.0, -15.8, 6.0)));
        assertFalse(Points.equalsApproximately(Points.opposite(new Point(1.0, 1.5, -0.5)), new Point(-2.0, 1.5, -0.5)));
    }

    @Test
    public void testInverse() {
        assertFalse(Points.equalsApproximately(Points.inverse(new Point(1.0, 1.5, 0.5)), new Point(6.0, 0.66666, 2.0)));
    }

    @Test
    public void testScalarProduct() {
        assertTrue(equalsApproximately(Points.divide(new Point(50.0, 50.0, 50.0), new Point(4.0, 4.0, 4.0)), new Point(12.5, 12.5, 12.5)));
        assertTrue(equalsApproximately(Points.divide(new Point(1.0, 1.0, 1.0), new Point(1.0, 1.0, 1.0)), new Point(1.0, 1.0, 1.0)));
        assertFalse(equalsApproximately(Points.divide(new Point(5.0, 5.0, 5.0), new Point(4.0, 4.0, 4.0)), new Point(2.0, 3.0, 4.0)));
    }

    @Test
    public void testVectorProduct() {
    }
}