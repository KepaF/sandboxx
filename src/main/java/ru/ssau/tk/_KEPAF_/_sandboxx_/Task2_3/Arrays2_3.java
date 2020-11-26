package ru.ssau.tk._KEPAF_._sandboxx_.Task2_3;

public class Arrays2_3 {
    public static int[] setNumber(int size) {
        int[] array = new int[size];
        int count = 1;
        for (int i = 0; i < array.length; i++) {
            array[i] = count;
            count = count + 2;
        }
        return array;
    }
}
