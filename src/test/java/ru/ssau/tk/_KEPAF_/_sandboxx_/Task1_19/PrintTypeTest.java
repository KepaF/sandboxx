package ru.ssau.tk._KEPAF_._sandboxx_.Task1_19;

import org.testng.annotations.Test;
import ru.ssau.tk._KEPAF_._sandboxx_.Person;
import ru.ssau.tk._KEPAF_._sandboxx_.Point;

import static org.testng.Assert.*;

public class PrintTypeTest {

    @Test
    public void testPrintType() {
        PrintType.printType("string");
        PrintType.printType('c');
        PrintType.printType((byte) 1);
        PrintType.printType((short) 1);
        PrintType.printType(1);
        PrintType.printType(3L);
        PrintType.printType(5.1f);
        PrintType.printType(5.5f);
        PrintType.printType(true);
        PrintType.printType(new Person());
        PrintType.printType(new Point(0, 0, 0));
        PrintType.printType(null);
    }

}