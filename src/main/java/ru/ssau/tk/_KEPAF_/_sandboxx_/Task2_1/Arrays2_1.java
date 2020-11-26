package ru.ssau.tk._KEPAF_._sandboxx_.Task2_1;

public class Arrays2_1 {
    public static int[] setnumber(int size) {
        int[] array = new int[size];
        for (int i = 7; i < array.length; i++) {
            array[i] = i;
        }
        return array;
    }
}

