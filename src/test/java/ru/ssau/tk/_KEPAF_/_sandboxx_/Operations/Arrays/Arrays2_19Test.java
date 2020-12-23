package ru.ssau.tk._KEPAF_._sandboxx_.Operations.Arrays;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Arrays2_19Test {
    @Test
    public void testSetArrayEven() {
        int[] array = new int[]{1,2,3,4,5,6,7,8,9,20};
        //  0 1 2 3 4 5 6 7 8 9
        assertEquals(Arrays2_19.setArrayEven(array),25);//1+3+5+7+9
    }
}