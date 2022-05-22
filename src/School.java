package src;

public class School {
    private String name;
    private String certification;
    private String phonenumber;
    private String addres;
    private String email;
    private String web;
    private String principal;

    // Managers
    


    public School(){}

    public School(String name, String certification, String phonenumber, String addres, String email, String web, String principal) {
        this.name = name;
        this.certification = certification;
        this.phonenumber = phonenumber;
        this.addres = addres;
        this.email = email;
        this.web = web;
        this.principal = principal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCertification() {
        return certification;
    }

    public void setCertification(String certification) {
        this.certification = certification;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getAddres() {
        return addres;
    }

    public void setAddres(String addres) {
        this.addres = addres;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getWeb() {
        return web;
    }

    public void setWeb(String web) {
        this.web = web;
    }

    public String getPrincipal() {
        return principal;
    }

    public void setPrincipal(String principal) {
        this.principal = principal;
    }
}