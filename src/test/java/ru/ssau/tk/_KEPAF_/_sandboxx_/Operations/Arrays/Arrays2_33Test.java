package ru.ssau.tk._KEPAF_._sandboxx_.Operations.Arrays;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Arrays2_33Test {
    @Test
    public void testGetArraySting() {
        String[] array = new String[]{"hello","world"};
        Arrays2_33.getArraySting(array);
    }
}