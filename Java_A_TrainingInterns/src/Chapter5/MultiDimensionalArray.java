package Chapter5;

import java.util.Scanner;

public class MultiDimensionalArray {
    public static void main(String[] args) {
        final int ROWS = 2;
        final int COLS = 3;
        //Creating a 2D array
        int[][] arTestMarks = new int[ROWS][COLS];
        String[] arStNames = new String[ROWS];
        Scanner sc = new Scanner(System.in);
        String stName, remarks;
        int testMark;

        for (int i = 0; i < ROWS; i++) {
            System.out.print("Enter name for student " + (i + 1) + ": ");
            stName = sc.next();
            arStNames[i] = stName;
            //get 3 tests
            for (int j = 0; j < COLS; j++) {
                System.out.print("Enter Test " + (j + 1) + " for " + stName + ": ");
                testMark = sc.nextInt();
                arTestMarks[i][j] = testMark;
            }
        }

        System.out.println("\n===================OUTPUT=======================\n");
        System.out.println("Name\tTest 1\tTest 2\tTest 3\tAverage\tRemarks");
        System.out.println("-----------------------------------------------");
        for (int i = 0; i < arTestMarks.length; i++) {
            System.out.print(arStNames[i] + "\t");
            double sum = 0, average = 0;

            for (int j = 0; j < arTestMarks[i].length; j++) {
                System.out.print(arTestMarks[i][j] + "\t\t");
                sum +=arTestMarks[i][j];
            }
            average = Math.round((sum / COLS)) ;
            //remarks = average >= 60 ? "Pass" : "Fail";
            System.out.println(average + "\t" + (average >= 60 ? "Pass" : "Fail"));
            System.out.println();
        }


    }
}
