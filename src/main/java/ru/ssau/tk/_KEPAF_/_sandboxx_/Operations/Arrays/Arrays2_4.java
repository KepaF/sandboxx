package ru.ssau.tk._KEPAF_._sandboxx_.Operations.Arrays;

public class Arrays2_4 {
    public static int[] setNumber(int size) {
        int[] arr = new int[size];
        int count = size * 2;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = count;
            count = count - 2;
        }
        return arr;

    }
}
