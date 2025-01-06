package Chapter1;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        //Declare
        int age, birthYear, hoursWorked;
        double salary;
        String name;
        char positionCode;
        final int CURRENT_YEAR = 2025;
        final String COMPANY_NAME = "iLAB Quality";
        final double HOURLY_RATE = 350;
        final double TAX = 0.25;
        Scanner sc = new Scanner(System.in);

        //Assign
        System.out.print("Please enter your name: ");
        name = sc.nextLine();
        System.out.print("Enter birth year: ");
        birthYear = sc.nextInt();
        System.out.print("Enter hours worked: ");
        hoursWorked = sc.nextInt();
        System.out.print("Please specify position code. (S - Senior, J- Junior, I - Intern): ");
        positionCode = sc.next().charAt(0);

        age = CURRENT_YEAR - birthYear;
        salary = (hoursWorked * HOURLY_RATE) - ((hoursWorked * HOURLY_RATE) * TAX);

        System.out.println("============" + COMPANY_NAME + "===============");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Position Code " + positionCode);
        System.out.println("Salary: " + salary);
    }
}
