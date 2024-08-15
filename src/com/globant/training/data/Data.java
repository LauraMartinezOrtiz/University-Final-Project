package src.com.globant.training.data;

import src.com.globant.training.model.*;

import java.util.ArrayList;
import java.util.List;

public class Data {
    private final List<Teacher> teachers = new ArrayList<>();;
    private final List<Student> students = new ArrayList<>();;
    private final List<Subject> classes = new ArrayList<>();;

    public void setInitialData() {
        teachers.add(new FulltimeTeacher("Esteban Sosa", 5));
        teachers.add(new FulltimeTeacher("Alejandra Aguilar", 7));
        teachers.add(new FulltimeTeacher("Guillermo Suarez", 2));


        teachers.add(new ParttimeTeacher("Angela Ortiz",4));
        teachers.add(new ParttimeTeacher("Manuel Moreno",1));
        teachers.add(new ParttimeTeacher("Liliana Osorio",9));

        students.add(new Student("Luis Corrales", 22, 10052344));
        students.add(new Student("Santiago Olano", 25, 10054561));
        students.add(new Student("Stiven Garcia", 22, 16752344));
        students.add(new Student("Diana Lopez", 22, 12342344));
        students.add(new Student("Sofia Navarro", 22, 20352355));
        students.add(new Student("Nicolas Vega", 22, 33022366));


        classes.add(new Subject("Data structures", "204M", students.subList(0,2), teachers.get(1)));
        classes.add(new Subject("Web advanced", "203L", students.subList(2,5), teachers.get(4)));
        classes.add(new Subject("Discrete math", "305A", students.subList(3,5), teachers.get(5)));
        classes.add(new Subject("Software architecture", "102B", students.subList(0,5), teachers.get(3)));
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public List<Student> getStudents() {
        return students;
    }

    public List<Subject> getClasses() {
        return classes;
    }
}
