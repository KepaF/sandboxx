package ru.ssau.tk._KEPAF_._sandboxx_.String;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Sring3_2Test {

    @Test
    public void testGetStr() {
        String temp = "hello world";
        new String3_2().getStr(temp);
        String _2temp = "Привет мир";
        new String3_2().getStr(_2temp);
    }
}