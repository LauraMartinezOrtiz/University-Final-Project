package src.com.globant.training.view;

import src.com.globant.training.data.Data;
import src.com.globant.training.model.University;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    private static final Data data = new Data();
    private static University university;

    public static void main(String[] args) {
        //showOptions();
        data.setInitialData();
        university = new University(data.getTeachers(), data.getStudents(), data.getClasses());
        addStudent();
    }


    public static void showOptions() {
        System.out.print(
                "1. Print all the professors with their data  \n"
                        + "2. Print all the classes \n"
                        + "3. Create a new student and add it to an existing class \n"
                        + "4. Create a new class \n"
                        + "5. Search a student and list all their classes \n"
                        + "6. Exit"
        );

        int selection = scanner.nextInt();
        scanner.nextLine();

        switch (selection) {
            case 1:
                showTeachers();
                break;
            case 2:
                showClasses();
                break;
            case 3:
                break;
            default:
        }
    }

    public static void showTeachers() {
        System.out.println("List of teachers" + university.showTeacher());
    }

    public static void showClasses() {
        System.out.println("List of classes \n" + university.showAllClasses());
        classesSubmenu();
    }

    public static void classesSubmenu() {
        System.out.println("Enter the name of a class in order to print the class data: ");
        String name = scanner.nextLine();
        scanner = new Scanner(System.in);
        System.out.println("Details of subject: " + university.showSubject(name));
    }

    public static void addStudent() {
        System.out.println("Enter the name of the student: ");
        String name = scanner.nextLine();
        scanner = new Scanner(System.in);

        System.out.println("Enter the age of the student: ");
        int age = scanner.nextInt();
        scanner = new Scanner(System.in);

        System.out.println("Enter the ID of the student: ");
        long id = scanner.nextLong();
        scanner = new Scanner(System.in);

        System.out.println("Enter the name of a class in which th student will be added: ");
        String subjectName = scanner.nextLine();
        scanner = new Scanner(System.in);

        university.enrollStudent(subjectName, name, age, id);
        System.out.println(university.showSubject(subjectName));

    }


}
