package ru.ssau.tk._KEPAF_._sandboxx_.Operations.Arrays;

public class Arrays2_9 {
    public static int[] setfunction(int firstNumber, int delta, int size) {
        int[] arr = new int[size];
        arr[0] = firstNumber;
        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i - 1] + delta;
        }
        return arr;
    }
}
