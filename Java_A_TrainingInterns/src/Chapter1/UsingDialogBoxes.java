package Chapter1;

import javax.swing.*;

/*
* Get input from the user using dialog boxes
* from the JOption Pane class*/
public class UsingDialogBoxes {
    public static void main(String[] args) {
        //Declare
        int age, birthYear, hoursWorked;
        double salary;
        String name;
        char positionCode;
        String strOutput;
        final int CURRENT_YEAR = 2025;
        final String COMPANY_NAME = "iLAB Quality";
        final double HOURLY_RATE = 250;
        final double TAX = 0.25;
        //Assign
        name = JOptionPane.showInputDialog("Please enter your name");
        birthYear = Integer.parseInt(JOptionPane.showInputDialog("Enter birth year"));
        hoursWorked = Integer.parseInt(JOptionPane.showInputDialog("Enter hours worked"));
        positionCode = JOptionPane.showInputDialog("Please specify position code").charAt(0);

        age = CURRENT_YEAR - birthYear;
        salary = (hoursWorked * HOURLY_RATE) - ((hoursWorked * HOURLY_RATE) * TAX);

        //USE
        strOutput = "Name: " + name + "\nAge: " + age + "\nPosition Code: " + positionCode +
                "\nHours Worked: " + hoursWorked + "\nSalary: " + salary;
        JOptionPane.showMessageDialog(null,strOutput);
    }
}
