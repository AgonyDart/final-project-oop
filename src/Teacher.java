package src;

import java.util.Date;

public class Teacher extends Worker {
    private int coursesLength;
    private String courses[] = new String[coursesLength];

    public Teacher() {
    }

    public Teacher(String bankId, String rfc, String activity, String degree, int access, String name, String socialNumber, String address, String email, String phonenumber, String schedule, Date timestamp, String[] courses) {
        super(bankId, rfc, activity, degree, access, name, socialNumber, address, email, phonenumber, schedule, timestamp);
        this.courses = courses;
    }

    public String[] getCourses() {
        return courses;
    }

    public void setCourses(String[] courses) {
        this.courses = courses;
    }
}
