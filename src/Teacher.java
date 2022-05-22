package src;

import java.util.Date;

public class Teacher extends Person {
    private String bankId;
    private String rfc;
    private String activity;
    private String degree;
    private int access;

    public Teacher() {
    }

    public Teacher(String bankId, String rfc, String activity, String degree, int access, String name,
            String socialNumber, String address, String email, String phonenumber, String schedule, Date timestamp) {
        super(name, socialNumber, address, email, phonenumber, schedule, timestamp);
        this.bankId = bankId;
        this.bankId = rfc;
        this.bankId = activity;
        this.bankId = degree;
        this.access = access;
    }

    public String getBankId() {
        return bankId;
    }

    public void setBankId(String bankId) {
        this.bankId = bankId;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public int getAccess() {
        return access;
    }

    public void setAccess(int access) {
        this.access = access;
    }
}