package ru.ssau.tk._KEPAF_._sandboxx_.Task2_2;

import org.testng.annotations.Test;
import ru.ssau.tk._KEPAF_._sandboxx_.Task2_1.Arrays2_1;

import static org.testng.Assert.*;

public class Arrays2_2Test {

    @Test
    public void testSetNumber() {
        int[] array = new Arrays2_2().setNumber(10);
        assertEquals(array.length, 10);
        for (int i = 1; i < 9; i++) {
            assertEquals(array[i], 1);
        }
        assertEquals(array[0], 2);
        assertEquals(array[9], 2);

    }

}