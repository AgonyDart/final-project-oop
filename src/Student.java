package src;

import java.util.Date;

public class Student extends Person {
    private String controlNumber;
    private String carrier;
    private char gender;
    private Date birthdate;
    private boolean status;

    public Student(){}

    public Student(String controlNumber, String carrier, char gender, Date birthdate, boolean status, String name, String socialNumber, String address, String email, String phonenumber, String schedule, Date timestamp) {
        super(name, socialNumber, address, email, phonenumber, schedule, timestamp);
        this.controlNumber = controlNumber;
        this.carrier = carrier;
        this.gender = gender;
        this.birthdate = birthdate;
        this.status = status;
    }

    public String getControlNumber() {
        return controlNumber;
    }

    public void setControlNumber(String controlNumber) {
        this.controlNumber = controlNumber;
    }

    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}