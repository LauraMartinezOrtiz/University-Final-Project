package src.com.globant.training.view;

import src.com.globant.training.data.Data;
import src.com.globant.training.model.Subject;
import src.com.globant.training.model.Student;
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
        showClasses();
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
                //submenu to select a class in order to print the class data including its
                //teacher and students
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

        System.out.println("Details of subject: " + university.checkClassExists(name));
        /*if ()
        System.out.println("That class doesn't exist. Try again");
        classesSubmenu();*/
    }

    //public void enrollStudent(Subject subject, Student student) {
    // if (university.checkClassExists(subject)) {
    //university.enrollClass(student);
    //  }
    //}


}
