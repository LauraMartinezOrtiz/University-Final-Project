package src.com.globant.training.model;

public class ParttimeTeacher extends Teacher {

    private int activeHours;

    public ParttimeTeacher(String name, int activeHours) {
        super(name);
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

    @Override
    public String toString() {
        return "Name: " + getName() +
                " - Salary: " + calculateSalary() +
                " - Active hours: " + activeHours;
    }
}
