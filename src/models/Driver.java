package models;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

/**
 * This class runs the application and handles the models.Product I/O
 *
 * @version 5.0
 */
public class Driver {

    private Scanner input = new Scanner(System.in);

    private EmployeeAPI emp1 = new EmployeeAPI();


    public Driver() {
        runMenu();
    }

    public static void main(String[] args) {
        new Driver();
    }

    private int mainMenu() {
        System.out.println("Employee Menu");
        System.out.println("---------");
        System.out.println("  1) Add Doctor");
        System.out.println("  2) List Doctors");
        System.out.println("  3) Delete Doctor");
        System.out.println("  --------------------");
        System.out.println("  4) Save to XML");
        System.out.println("  5) Load to XML");
        System.out.println("  0) Exit");
        System.out.print("==>> ");
        int option = input.nextInt();
        return option;
    }

    private void runMenu() {
        int option = mainMenu();
        while (option != 0) {

            switch (option) {
                case 1:
                    addEmployee();
                    break;
                case 2:
                    listEmployees();
                    break;
                case 3:
                    deleteEmployee();
                    break;
                case 4:
                    try {
                        emp1.save();
                    } catch (Exception e) {
                        System.err.println("Error saving to file: " + e);
                    }
                    break;
                case 5:
                    try {
                        emp1.load();
                    } catch (Exception e) {
                        System.err.println("Error reading from file: " + e);
                    }
                    break;
                default:
                    System.out.println("Invalid option entered: " + option);
                    break;
            }


            System.out.println("\nPress any key to continue...");
            input.nextLine();
            input.nextLine();

            option = mainMenu();
        }

        //the user chose option 0, so exit the program
        System.out.println("Exiting... bye");
        System.exit(0);
    }

    //gather the product data from the user and create a new product.
    private void addEmployee() {
        System.out.println("Enter the number of the employee you want to add:");
        System.out.println("  1) AdminWorker");
        System.out.println("  2) Lecturer");
        System.out.println("  3) Manager");
        int emp = input.nextInt();
        String y = input.nextLine();
        System.out.println("Enter the first name of the employee:");
        String firstName = input.nextLine();
        System.out.println("Enter the second name of the employee: ");
        String secondName = input.nextLine();
        System.out.println("Enter the pps number of the employee: ");
        String ppsNumber = input.nextLine();


        if (emp == 1) {
            System.out.println("Grade of this AdminWorker ");
            int grade = input.nextInt();

            emp1.addEmployee(new AdminWorker(firstName, secondName, ppsNumber, grade));

        }
        if (emp == 2) {
            System.out.println("Level of this Lecturer ");
            int level = input.nextInt();
            emp1.addEmployee(new Lecturer(firstName, secondName, ppsNumber, level));
        }
        if (emp == 3) {

            System.out.println("Level of this Manager ");
            String dept = input.nextLine();
            System.out.println("Grade of this Manager ");
            int grade = input.nextInt();
            emp1.addEmployee(new Manager(firstName, secondName, ppsNumber, dept, grade));

        }
    }

    public void listEmployees() {
        System.out.println(emp1.listEmployees());
    }


    private void deleteEmployee() {

        System.out.println(emp1.listEmployees());

        if (emp1.numberOfEmployees() > 0) {

            System.out.print("Enter the index of the Employee to delete: ");
            int index = input.nextInt();
            emp1.removeEmployee(index);
        } else {
            System.out.println("There is no Employee for this index number");
        }

    }
}