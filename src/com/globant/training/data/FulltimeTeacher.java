package src.com.globant.training.data;

public class FulltimeTeacher extends Teacher {

    private int experienceYears;

    public FulltimeTeacher(String name, double salary, int experienceYears) {
        super(name, salary);
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
}
