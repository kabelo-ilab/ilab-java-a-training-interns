package Chapter2;

public class IncrementAndDecrement {
    public static void main(String[] args) {
        int age = 25;

        System.out.println("=============INCREMENT=================");
        System.out.println("Original Age is " + age);//25
        System.out.println("Age changed to: " + ++age);//26
        System.out.println("Age changed again to: " + age++);//26
        System.out.println("Another change for age: " + age++);//27

        System.out.println("-----------------------------------------");

        age = 25;
        System.out.println("=============DECREMENT=================");
        System.out.println("Original Age is " + age);//25
        System.out.println("Age changed to: " + --age);//24
        System.out.println("Age changed again to: " + age--);//24
        System.out.println("Another change for age: " + age--);//23

    }
}
