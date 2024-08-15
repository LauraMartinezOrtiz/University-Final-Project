package src.com.globant.training.model;

import java.util.List;

public class University {

    private List<Teacher> teachers;
    private List<Student> students;
    private List<Subject> subjects;

    public University(List<Teacher> teachers, List<Student> students, List<Subject> subjects) {
        this.teachers = teachers;
        this.students = students;
        this.subjects = subjects;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public List<Student> getStudents() {
        return students;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public void setClasses(List<Subject> subjects) {
        this.subjects = subjects;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public void setTeachers(List<Teacher> teachers) {
        this.teachers = teachers;
    }

    public StringBuilder showTeacher() {
        StringBuilder info = new StringBuilder();
        for (Teacher teacher : teachers) {
            info.append("\n").append(teacher.toString());
        }
        return info;
    }

    public StringBuilder showAllClasses() {
        StringBuilder info = new StringBuilder();
        int counter = 1;
        for (Subject subject : subjects) {
            info.append(counter).append(". ").append(subject.getName()).append("\n");
            counter++;
        }
        return info;
    }

    public StringBuilder showSubject(String subjectName) {
        StringBuilder info = new StringBuilder();
        boolean found = false;

        for (Subject subject : subjects) {
            if (subject.getName().equalsIgnoreCase(subjectName)) {
                info.append("\n").append(subject);
                found = true;
                break;
            }
        }
        if (!found) {
            info.append("That class doesn't exist. Please try again.");
        }
        return info;
    }

    public void enrollStudent(String subjectName, String name, int age, long id) {
        Student student = new Student(name, age, id);
        for (Subject subject : subjects) {
            if (subject.getName().equalsIgnoreCase(subjectName)) {
                subject.getStudents().add(student);
            }
        }
    }
}
