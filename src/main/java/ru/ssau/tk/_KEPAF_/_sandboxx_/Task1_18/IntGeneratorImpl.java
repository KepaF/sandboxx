package ru.ssau.tk._KEPAF_._sandboxx_.Task1_18;

public class IntGeneratorImpl implements IntGenerator {
    private int count = 0;

    @Override
    public int nexInt() {
        return count++;
    }
}
