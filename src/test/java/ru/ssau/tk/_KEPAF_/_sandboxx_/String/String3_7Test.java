package ru.ssau.tk._KEPAF_._sandboxx_.String;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class String3_7Test {
    @Test
    public void testGetIndexStr() {
        assertEquals(String3_7.getIndexStr("Denis Dorfirev","Denis"),0);
        assertEquals(String3_7.getIndexStr("Physic","ys"),2);
        assertEquals(String3_7.getIndexStr("Abracadabra","da"),6);

    }

}