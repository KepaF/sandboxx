package ru.ssau.tk._KEPAF_._sandboxx_;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class PersonTest {
    @Test
    public void test() {
        Person person = new Person();
        Person goodPerson = new Person();

        person.setFirstName("Knopa");
        person.setLastName("Cat");
        person.setPassportId(8945);

        goodPerson.setFirstName("o");
        goodPerson.setLastName("dd");
        goodPerson.setPassportId(0000);

        assertEquals(person.getFirstName(), "Knopa");
        assertNotEquals(person.getLastName(), "Tac");
        assertEquals(person.getPassportId(), 8945);

        assertNotEquals(goodPerson.getFirstName(), "t");
        assertEquals(goodPerson.getLastName(), "dd");
        assertEquals(goodPerson.getPassportId(), 0000);

    }

}