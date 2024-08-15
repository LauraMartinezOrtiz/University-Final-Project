package src.com.globant.training.model;

public abstract class Teacher extends Person {

    protected static final double baseSalary = 150.000;

    public Teacher(String name) {
        super(name);
    }

    public abstract double calculateSalary();

    @Override
    public abstract String toString();
}
