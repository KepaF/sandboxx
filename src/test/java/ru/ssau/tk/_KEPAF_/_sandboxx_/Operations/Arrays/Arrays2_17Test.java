package ru.ssau.tk._KEPAF_._sandboxx_.Operations.Arrays;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Arrays2_17Test {
    @Test
    public void testNumberEven() {
        int[] array = new int[10];
        for(int i=0;i<array.length;i++){
            array[i] = i;
        }
        assertEquals(Arrays2_17.numberEven(array),5);
    }

}