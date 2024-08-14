package src.com.globant.training.data;

public abstract class Teacher extends Person {

    private double salary;
    protected static final double baseSalary = 123;

    public Teacher(String name, double salary) {
        super(name);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public abstract double calculateSalary();
}
