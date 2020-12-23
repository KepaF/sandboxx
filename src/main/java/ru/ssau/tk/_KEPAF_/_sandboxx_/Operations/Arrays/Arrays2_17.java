package ru.ssau.tk._KEPAF_._sandboxx_.Operations.Arrays;

public class Arrays2_17 {
    static int numberEven(int[] array) {
        int count = 0;
        for (int i : array) {
            if (array[i] % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}
