package src;

public abstract class Topic {
    protected String name;
    protected String schedule;

    public Topic(){}

    public Topic(String name, String schedule) {
        this.name = name;
        this.schedule = schedule;
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
}
