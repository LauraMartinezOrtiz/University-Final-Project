package src.com.globant.training.model;

import java.util.ArrayList;
import java.util.List;

public class Subject {

    private String name;
    private String classroom;
    private List<Student> students = new ArrayList<>();
    private Teacher teacher;

    public Subject(String name, String classroom, List<Student> students, Teacher teacher) {
        this.name = name;
        this.classroom = classroom;
        this.students = students;
        this.teacher = teacher;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassroom() {
        return classroom;
    }

    public void setClassroom(String classroom) {
        this.classroom = classroom;
    }

    public List<Student> getStudents() {
        return students;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    @Override
    public String toString() {
        return "Class name: " + getName() +
                " - Classroom: " + getClassroom() +
                " - Students: " + getStudents() +
                " - Teacher: " + getTeacher().getName();
    }
}
