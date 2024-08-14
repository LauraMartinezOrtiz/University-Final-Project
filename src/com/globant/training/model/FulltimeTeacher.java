package src.com.globant.training.model;

public class FulltimeTeacher extends Teacher {

    private int experienceYears;

    public FulltimeTeacher(String name, int experienceYears) {
        super(name);
        this.experienceYears = experienceYears;
    }

    public int getExperienceYears() {
        return experienceYears;
    }

    public void setExperienceYears(int experienceYears) {
        this.experienceYears = experienceYears;
    }

    @Override
    public double calculateSalary() {
        return baseSalary * (1.1 * experienceYears);
    }

    @Override
    public String toString() {
        return "Name: " + getName() +
                " - Salary: " + calculateSalary() +
                " - Experience: " + experienceYears;
    }
}
