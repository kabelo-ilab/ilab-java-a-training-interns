package Chapter5;

import java.util.Scanner;

public class ParallelArrays {
    public static void main(String[] args) {
        final int SIZE = 3;
        int[] arTestMarks = new int[SIZE];
        String[] arStNames = new String[SIZE];
        Scanner sc = new Scanner(System.in);
        String stName;
        int testMark;

        for (int i = 0; i < SIZE; i++) {
            System.out.print("Enter name for student " + (i + 1) + ": ");
            stName = sc.next();
            arStNames[i] = stName;

            System.out.print("Enter test mark for " + stName + ": ");
            testMark = sc.nextInt();
            arTestMarks[i] = testMark;
        }

        System.out.println("==============DETAILS====================");
        for (int i = 0; i < SIZE; i++) {
            System.out.println(arStNames[i] + "\t" + arTestMarks[i]);
        }


    }
}
