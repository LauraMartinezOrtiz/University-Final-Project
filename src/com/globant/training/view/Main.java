package src.com.globant.training.view;

import src.com.globant.training.data.Data;
import src.com.globant.training.model.University;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    private static final Data data = new Data();
    private static University university;

    public static void main(String[] args) {
        data.setInitialData();
        university = new University(data.getTeachers(), data.getStudents(), data.getClasses());
        start();
    }

    public static void start() {
        int option;
        try {
            do {
                showMenu();
                option = scanner.nextInt();
                scanner = new Scanner(System.in);
                operations(option);

            } while (option != 6);
        } catch (InputMismatchException exception) {
            System.out.println("Enter a number for your choice");
        }
    }


    public static void showMenu() {
        System.out.print("------------------------------------------------ \n" +
                "Please enter the number of the option that you want:\n" +
                "1. Print all the professors with their data  \n"
                + "2. Print all the classes \n"
                + "3. Create a new student and add it to an existing subject \n"
                + "4. Create a new subject \n"
                + "5. Search a student and list all their classes \n"
                + "6. Exit \n"
        );
    }

    public static void operations(int choice) {
        switch (choice) {
            case 1:
                showTeachers();
                break;
            case 2:
                showClasses();
                break;
            case 3:
                addStudent();
                break;
            case 4:
                addSubject();
                break;
            case 5:
                listClassesOfStudent();
                break;
            case 6:
                break;
            default:
                System.out.println("Try again");
                break;
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
        System.out.println("Enter the name of a subject in order to print the subject's information: ");
        String name = scanner.nextLine();
        scanner = new Scanner(System.in);
        while (university.searchSubjectByName(name) == null) {
            System.out.println("There's no subject with that name. Try again.");
            name = scanner.nextLine();
            scanner = new Scanner(System.in);
        }
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

        System.out.println("Enter the name of the class in which the student will be added: ");
        String subjectName = scanner.nextLine();
        scanner = new Scanner(System.in);

        while (university.searchSubjectByName(subjectName) == null) {
            System.out.println("There's no subject with that name. Try again.");
            subjectName = scanner.nextLine();
            scanner = new Scanner(System.in);
        }

        university.enrollStudent(subjectName, name, age, id);
        StringBuilder subjectInfo = university.showSubject(subjectName);
        System.out.println("The student " + name + " was added successfully" + subjectInfo);
    }

    public static void addSubject() {
        System.out.println("Enter the name of the new subject: ");
        String name = scanner.nextLine();
        scanner = new Scanner(System.in);

        System.out.println("Enter the classroom: ");
        String classroom = scanner.nextLine();
        scanner = new Scanner(System.in);

        System.out.println("Enter the ID of the student: ");
        long id = scanner.nextLong();
        scanner = new Scanner(System.in);

        while (university.searchStudentById(id) == null) {
            System.out.println("There's no student with that ID. Try again.");
            id = scanner.nextLong();
            scanner = new Scanner(System.in);
        }

        System.out.println("Enter the name of the teacher of this subject: ");
        String teacherName = scanner.nextLine();

        while (university.searchTeacherByName(teacherName) == null) {
            System.out.println("There's no teacher with that name. Try again.");
            teacherName = scanner.nextLine();
            scanner = new Scanner(System.in);
        }

        System.out.println("New class added successfully: \n" + university.createSubject(name, classroom, id, teacherName));
    }


    public static void listClassesOfStudent() {
        System.out.println("Enter the ID of the student: ");
        long id = scanner.nextLong();

        while (university.searchStudentById(id) == null) {
            System.out.println("There's no student with that ID. Try again.");
            id = scanner.nextLong();
            scanner = new Scanner(System.in);
        }

        System.out.println("The student is included in the following subjects:" + university.getSubjectForStudent(id));
    }
}

