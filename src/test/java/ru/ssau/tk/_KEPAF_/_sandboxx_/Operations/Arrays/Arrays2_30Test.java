package ru.ssau.tk._KEPAF_._sandboxx_.Operations.Arrays;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Arrays2_30Test {
    @Test
    public void testGetVector() {
        assertEquals(Arrays2_30.getVector(3), new int[][]{{1, 2, 3}, {4,5}, {6}});
    }
}