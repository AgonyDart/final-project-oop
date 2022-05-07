package src;

import java.util.Date;

public class Worker extends Person {
    protected String bankId;
    protected String rfc;
    protected String activity;
    protected String degree;
    protected int access;

    public Worker(){
        access = 1;
    }

    public Worker(String bankId, String rfc, String activity, String degree, int access, String name, String socialNumber, String address, String email, String phonenumber, String schedule, Date timestamp) {
        super(name, socialNumber, address, email, phonenumber, schedule, timestamp);
        this.bankId = bankId;
        this.rfc = rfc;
        this.activity = activity;
        this.degree = degree;
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