package ru.ssau.tk._KEPAF_._sandboxx_.Operations.Arrays;

public class Arrays2_5 {
    public static int[] setNumber(int size) {
        int[] array = new int[size];
        array[0] = 0;
        array[1] = 1;
        for (int i = 2; i < array.length; i++) {
            array[i] = array[i-1]+array[i-2];
        }
        return array;
    }
}
