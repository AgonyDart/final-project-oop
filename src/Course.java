package src;

public class Course extends Topic {
    private String units;
    private int grades[] = new int[Integer.parseInt(units)];

    public Course(){}

    public Course(String units, String name, String schedule) {
        super(name, schedule);
        this.units = units;
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
