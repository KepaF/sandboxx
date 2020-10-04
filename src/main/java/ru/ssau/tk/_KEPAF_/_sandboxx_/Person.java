package ru.ssau.tk._KEPAF_._sandboxx_;

public class Person {
    private String firstName;
    private String lastName;
    private int passportId;
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
    public void setLastNameName(String lastName){
        this.lastName=lastName;
    }
    public void setPassportId(int passportId){
        this.passportId=passportId;
    }
}
