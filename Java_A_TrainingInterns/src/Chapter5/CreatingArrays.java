package Chapter5;

public class CreatingArrays {
    public static void main(String[] args) {
        //Declare
        //Array to store 5 elements
        Integer[] arTestMarks = new Integer[5];
        //Array with initial values
        String[] arNames = new String[]{
                "MIke", "Jessica", "Lewis", "Rachael", "Jenny"
        };
        Double[] arPrices = {15.99, 16.49, 20.00, 13.50};
        Character[] arLetters = {'A','E','I','O','U'};
        //Empty array
        Integer[] arNumbers;

        //Assign
        arTestMarks[2] = 89;
        arTestMarks[1] = 79;
        arTestMarks[0] = 91;
        arTestMarks[4] = 73;
        arTestMarks[3] = 86;

        arNumbers = new Integer[3];
        arNumbers[0] = 5;
        arNumbers[1] = 9;
        arNumbers[2] = 19;
        //Use
        display("Test Marks", arTestMarks);
        display("Prices", arPrices);
        display("Names", arNames);
        display("Letters", arLetters);
        display("Just Numbers", arNumbers);
    }

    static <T> void display(String title, T[] arElements){
        System.out.println("\n======" + title + "======");
        for (T e : arElements){
            System.out.print(e + "  ");
        }
    }
}
