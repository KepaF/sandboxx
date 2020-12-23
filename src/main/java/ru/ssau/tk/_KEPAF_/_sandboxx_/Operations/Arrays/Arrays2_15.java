package ru.ssau.tk._KEPAF_._sandboxx_.Operations.Arrays;

public class Arrays2_15 {
    static boolean setArray(int[] arr, int number) {
        for (int j : arr) {
            if (j == number) {
                return true;
            }
        }
        return false;
    }
}
