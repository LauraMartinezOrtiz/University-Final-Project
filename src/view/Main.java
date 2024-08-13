package src.view;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        showOptions();
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

                break;
            case 2:
                //submenu to select a class in order to print the class data including its
                //teacher and students
                break;
            case 3:
                break;
            default:
        }
    }
}
