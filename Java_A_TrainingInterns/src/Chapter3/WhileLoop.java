package Chapter3;

import java.util.Scanner;

/*
* While loop will execute while the condition is true*/
public class WhileLoop {
    public static void main(String[] args) {
        //display Tuesday 5 times
        int count = 1;
        while(count <= 5){
            System.out.println("Tuesday");
            count++;
        }
        System.out.println("==================================");

        /*calculate the sum of numbers entered by the user.
        enter zero to stop
         */
        Scanner sc = new Scanner(System.in);
        int number, sum = 0;

//        System.out.print("Enter a number to add: ");
//        number = sc.nextInt();
//
//        while (number != 0){
//            sum+= number;
//            //sum = sum + number;
//            System.out.print("Enter a number to add: ");
//            number = sc.nextInt();
//        }
//        System.out.println("Sum: " + sum);

        //The user should enter a name that is at least 3 characters long
        System.out.println("==================================");
        String name;

        System.out.print("Enter a name: ");
        name = sc.nextLine();

        while (name.length() < 3){
            System.out.print("Enter a name with at least 3 letters: ");
            name = sc.nextLine();
        }

    }
}
