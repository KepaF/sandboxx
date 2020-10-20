package ru.ssau.tk._KEPAF_._sandboxx_;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class PersonTest {
    Person person1 = new Person();
    Person person2 = new Person();
    Person person3 = new Person();
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

    @Test
    public void testFirstName() {
        assertNull(person1.getFirstName(), null);
        assertEquals(person1.getFirstName(), null);
        assertNotEquals(person2.getFirstName(), "Kepa");
        person1.setFirstName("Kopa");
        person2.setFirstName("Kepa");
        assertEquals(person2.getFirstName(), "Kepa");
        assertEquals(person1.getFirstName(), "Kopa");
    }

    @Test
    public void testLastName() {
        assertNull(person1.getLastName(), null);
        assertEquals(person1.getLastName(), null);
        assertNotEquals(person1.getLastName(), "Cat");
        person1.setLastName("Cat");
        assertEquals(person1.getLastName(), "Cat");
        person2.setLastName("Fredy");
        assertNotEquals(person1.getLastName(), "Fredy");
    }

    @Test
    public void testPassportID() {
        assertEquals(person3.getPassportId(), 0);
        person3.setPassportId(11115);
        assertEquals(person3.getPassportId(), 11115);
        assertNotEquals(person3.getPassportId(), 55551);
    }


}