package ru.ssau.tk._KEPAF_._sandboxx_;

public class Person {
    private String firstName;
    private String lastName;
    private int passportId;
    public Person() {

    }

    public Person(int passportId) {
        this.passportId = passportId;
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Person(String firstName, String lastName, int passportId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.passportId = passportId;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    int getPassportId(){
        return passportId;
    }

    public void setFirstName(String firstName){
        this.firstName=firstName;
    }
    public void setLastName(String lastName){
        this.lastName=lastName;
    }
    public void setPassportId(int passportId){
        this.passportId=passportId;
    }
    public static void main(String[] args){
        Person firstPerson = new Person();
        Person secondPerson = new Person();
        firstPerson.firstName="Knopa";
        firstPerson.lastName="Cat";
        firstPerson.passportId= 666111;

       secondPerson.firstName="Klepa";
        secondPerson.lastName="Cat";
        secondPerson.passportId= 555666;

        Person thirdPerson = new Person();
        Person fourthPerson = new Person("Kopa", "Kat");
        Person catPerson = new Person("Pepa", "Cat", 668889);
        Person sixthPerson = new Person(999666);

    }
}
