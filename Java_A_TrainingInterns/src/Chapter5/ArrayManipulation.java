package Chapter5;

import java.util.Random;

public class ArrayManipulation {
    public static void main(String[] args) {
        Random rnd = new Random();
        int[] arRandomNums = new int[20];
        int[] arOdd, arEven;
        int number, evenSize = 0, oddSize = 0, countEven = 0, countOdd = 0;

        for (int i = 0; i < arRandomNums.length; i++) {
            number = rnd.nextInt(10,75);
            arRandomNums[i] = number;
            if (number % 2 == 0){
                evenSize++;
            }else{
                oddSize++;
            }
        }
        arEven = new int[evenSize];
        arOdd = new int[oddSize];

        for (int i = 0; i < arRandomNums.length; i++) {
            if (arRandomNums[i] % 2 == 0){
                arEven[countEven] = arRandomNums[i];
                countEven++;
            }else{
                arOdd[countOdd] = arRandomNums[i];
                countOdd++;
            }
        }

        printArray("Original Array",arRandomNums);
        printArray("Even Array",arEven);
        printArray("Odd Array",arOdd);

    }

    static void printArray(String title, int[] ar){
        System.out.println("------- " + title + " --------");
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i] + "  ");
        }
        System.out.println();
    }
}
