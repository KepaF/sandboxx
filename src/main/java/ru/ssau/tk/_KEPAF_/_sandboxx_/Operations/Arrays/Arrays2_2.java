package ru.ssau.tk._KEPAF_._sandboxx_.Operations.Arrays;

public class Arrays2_2 {
    public int[] setNumber(int size) {
        int[] array = new int[size];
        array[0] = 2;
        array[size - 1] = 2;
        for (int i = 1; i < array.length - 1; i++) {
            array[i] = 1;
        }
        return array;
    }
}
