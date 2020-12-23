package ru.ssau.tk._KEPAF_._sandboxx_.Operations.Arrays;

public class Arrays2_19 {
    static int setArrayEven(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                sum += array[i];
            }
        }
        return sum;
    }
}
