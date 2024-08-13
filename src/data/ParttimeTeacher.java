package src.data;

public class ParttimeTeacher extends Teacher {

    private int activeHours;

    public ParttimeTeacher(String name, double salary, int activeHours) {
        super(name, salary);
        this.activeHours = activeHours;
    }

    public int getActiveHours() {
        return activeHours;
    }

    public void setActiveHours(int activeHours) {
        this.activeHours = activeHours;
    }

    @Override
    public double calculateSalary() {
        return baseSalary * activeHours;
    }
}
