package Chapter3;

import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//        String name;
//        do {
//            System.out.print("Enter a name: ");
//            name = sc.nextLine();
//        }while (name.length() < 3);
        System.out.println("============================");

        String response, selectedFruit = "None";
        /*select a fruit:
        A - Apple
        B - Banana
        M - Mango
        O - Orange
         */
        do {
            System.out.println("Select a fruit: \n" +
                    "A - Apple\nB - Banana\nM - Mango\nO - Orange");
            response = sc.nextLine();

        } while (!response.equals("A") && !response.equals("B") && !response.equals("M") && !response.equals("O"));

        switch (response){
            case "A" : selectedFruit = "Apple";
            break;
            case "B" : selectedFruit = "Banana";
                break;
            case "M" : selectedFruit = "Mango";
                break;
            case "O" : selectedFruit = "Orange";
                break;
        }
        System.out.println(selectedFruit);
    }
}
