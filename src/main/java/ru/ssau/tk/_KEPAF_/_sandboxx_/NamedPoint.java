package ru.ssau.tk._KEPAF_._sandboxx_;
import ru.ssau.tk._KEPAF_._sandboxx_.Task1_18.Resettable;
public class NamedPoint extends Point implements Resettable {
    private String name;

    public NamedPoint() {
        this(0, 0, 0, "Origin");
    }

    public NamedPoint(double x, double y, double z) {
        super(x, y, z);
    }

    public NamedPoint(double x, double y, double z, String name) {
        super(x, y, z);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void reset() {
        name = "Absent";
    }
}