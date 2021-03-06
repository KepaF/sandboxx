package ru.ssau.tk._KEPAF_._sandboxx_.Arrays;

import org.testng.annotations.Test;
import ru.ssau.tk._KEPAF_._sandboxx_.Operations.Arrays.Arrays2_3;

import static org.testng.Assert.*;

public class Arrays2_3Test {
    @Test
    public void testSetNumber() {
        int[] array = Arrays2_3.setNumber(10);
        for (int i = 0; i < 10; i++) {
            assertEquals(array[i], 2 * i + 1);
        }
        assertEquals(array.length, 10);
    }
}