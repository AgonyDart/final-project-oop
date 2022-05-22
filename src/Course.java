package src;

public class Course {
    private String name;
    private String schedule;
    private String auxMaterial;
    private String units;
    private int grades[];

    public Course(){}

    public Course(String name, String schedule, String auxMaterial, String units, int grades[]) {
        this.name = name;
        this.schedule = schedule;
        this.auxMaterial = auxMaterial;
        this.units = units;
        this.grades = grades;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    public String getAuxMaterial() {
        return auxMaterial;
    }

    public void setAuxMaterial(String auxMaterial) {
        this.auxMaterial = auxMaterial;
    }

    public String getUnits() {
        return units;
    }

    public void setUnits(String units) {
        this.units = units;
    }

    public int[] getGrades() {
        return grades;
    }

    public void setGrades(int[] grades) {
        this.grades = grades;
    }
}