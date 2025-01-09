package Chapter5;

public class ArraySearch {
    public static void main(String[] args) {
        int[] arNumbers = {446,4,12,63,81,97,34,74,63,33};
        String[] arNames = {"Mike", "Kabelo", "Sebastein","Michael", "Thabo"};
        //searchForNumber(4,arNumbers);
        System.out.println("Highest: " + getHighest(arNumbers));
        System.out.println("Lowest: " + getLowest(arNumbers));
        System.out.println("Name with most characters: " + getHighestChars(arNames));
    }
    static void searchForNumber(int num, int[] ar){
        for (int i = 0; i < ar.length; i++) {
            if (num == ar[i]){
                System.out.println("Number: " + num + " found at position " + i);
                break;
            }
        }
    }
    static int getHighest(int[] ar){
        int max = ar[0];//446
        for (int i = 1; i < ar.length; i++) {
            if (ar[i] > max){
                max = ar[i];
            }
        }
        return max;
    }
    static int getLowest(int[] ar){
        int lowest = ar[0];
        for (int i = 1; i < ar.length; i++) {
            if (ar[i] < lowest){
                lowest = ar[i];
            }
        }
        return lowest;
    }
    /*create a method that will return a name
    with the most number of characters from an array
     */
    static String getHighestChars(String[] ar){
        int highest = ar[0].length();
        String name = "";
        for (int i = 0; i < ar.length; i++) {
            if (highest <= ar[i].length()){
                highest = ar[i].length();
                name = ar[i];
            }
        }
        return name;
    }
}
