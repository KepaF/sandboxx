package ru.ssau.tk._KEPAF_._sandboxx_.Operations.Arrays;

public class Arrays2_22 {
    static int getIndexOftenNumber(int[] array, int number) {
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                j = i;
            }
        }
        return j;
    }
}
