package Chapter4;

/*Method overloading is creating multiple methods
* with the same name but different parameter list*/
public class MethodOverloading {
    public static void main(String[] args) {
        System.out.println("Sum Integer: " + calcSum(3,4));
        System.out.println("Sum Double: " + calcSum(3.5,4.9));
        System.out.println("Sum Float: " + calcSum(3.7F,14.3F));

        System.out.println("Total: " + sum(5,7,9,14));

    }
    static int calcSum(int x, int y, int z){
        return x + y + z;
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
    //Calculate the sum of any number of integers
    static int sum(int... numbers){
        int total = 0;
        for(int num : numbers){
            total+=num;
        }
        return total;
    }
    static void formatNames(String... names){
        for (String name : names){
            System.out.println("[" + name + "]");
        }
    }
}
