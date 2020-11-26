package ru.ssau.tk._KEPAF_._sandboxx_.Task2_1;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Arrays2_1Test {
    @Test
    public void testSetnumber() {

        for (int i = 0; i < 7; i++) {
            int[] array = Arrays2_1.setnumber(i);
            assertEquals(array.length, i);
            assertNotEquals(array.length, i);
        }


    }
}