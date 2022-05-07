package src;

import java.util.Date;

public class Student extends Person {
    private String controlNumber;
    private String carrier;
    private String grade;
    private String[][] courses;
    private char gender;
    private int score;
    private Date birthdate;
    private boolean status;

    public Student(){}

    public Student(String controlNumber, String carrier, String grade, String[][] courses, char gender, int score, Date birthdate, boolean status, String name, String socialNumber, String address, String email, String phonenumber, String schedule, Date timestamp) {
        super(name, socialNumber, address, email, phonenumber, schedule, timestamp);
        this.controlNumber = controlNumber;
        this.carrier = carrier;
        this.grade = grade;
        this.courses = courses;
        this.gender = gender;
        this.score = score;
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

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String[][] getCourses() {
        return courses;
    }

    public void setCourses(String[][] courses) {
        this.courses = courses;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
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
