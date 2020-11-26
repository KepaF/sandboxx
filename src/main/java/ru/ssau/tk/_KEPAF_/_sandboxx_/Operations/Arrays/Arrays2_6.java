package ru.ssau.tk._KEPAF_._sandboxx_.Operations.Arrays;

public class Arrays2_6 {
    public static int[] setNumber(int size) {
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = i * i;
        }
        return array;
    }

}
