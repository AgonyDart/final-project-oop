package src;

import java.util.Date;

public abstract class Person {
    protected String name;
    protected String socialNumber;
    protected String address;
    protected String email;
    protected String phonenumber;
    protected String schedule;
    protected Date timestamp;

    public Person() {
    }

    public Person(String name, String socialNumber, String address, String email, String phonenumber, String schedule,
            Date timestamp) {
        this.name = name;
        this.socialNumber = socialNumber;
        this.address = address;
        this.email = email;
        this.phonenumber = phonenumber;
        this.schedule = schedule;
        this.timestamp = timestamp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSocialNumber() {
        return socialNumber;
    }

    public void setSocialNumber(String socialNumber) {
        this.socialNumber = socialNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }
}