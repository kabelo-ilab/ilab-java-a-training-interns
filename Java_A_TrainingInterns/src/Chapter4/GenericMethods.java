package Chapter4;

public class GenericMethods {
    public static void main(String[] args) {
        //Generic Method call
        GenericMethods.<Integer>displayNumbers(4,6);
        GenericMethods.<Double>displayNumbers(4.3,5.9);
        GenericMethods.<Float>displayNumbers(45.6F,13.6F);
        GenericMethods.<String>displayNumbers("One","Seven");
        GenericMethods.<Character>displayNumbers('5','9');
        GenericMethods.<String, Integer>checkNameLength("James",4);
    }

    static <T> void displayNumbers(T x, T y){
        System.out.println("x = " + x + ", y = " + y);
    }
    static int calcSum(int x, int y){
        return x + y;
    }
    static double calcSum(double x, double y){
        return x + y;
    }
    static float calcSum(float x, float y){
        return x + y;
    }

    static <T1, T2> void checkNameLength(T1 strName, T2 intLen){
        int l = strName.toString().length();
        System.out.println(strName + " has " + l + " characters." +
                "(" + (intLen.equals(strName.toString().length())) + ")");
    }
//    static <T>  calculate(T num1, T num2){
//
//    }
}
