package src;

public class Classroom {
    private int capacity;
    private boolean avaible;

    public Classroom(){}

    public Classroom(int capacity, boolean avaible) {
        this.capacity = capacity;
        this.avaible = avaible;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public boolean isAvaible() {
        return avaible;
    }

    public void setAvaible(boolean avaible) {
        this.avaible = avaible;
    }
}