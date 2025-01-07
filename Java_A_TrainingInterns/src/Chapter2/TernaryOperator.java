package Chapter2;

public class TernaryOperator {
    public static void main(String[] args) {
        //condition ? valueWhenTrue : valueWhenFalse;
        int age = 15;
//        if (age >= 18){
//            System.out.println("Can vote");
//        }else{
//            System.out.println("Cannot vote");
//        }

        System.out.println((age >= 18) ? "Can vote" : "Cannot vote");
        System.out.println("======================================");
        int number = 8;
        String results = "unknown";

//        if (number % 2 == 0){
//            results = "Even";
//        }else{
//            results = "Odd";
//        }

        //targetVariable = condition ? trueValue : falseValue;
        results = number % 2 == 0 ? "Even" : "Odd";
        System.out.println(results);
        System.out.println("======================================");

        int num = 7;
//        if (num % 2 == 0){
//            results = "Even";
//        } else if (num % 3 == 0) {
//            results = "Multiple of 3";
//        } else if (num % 5 == 0) {
//            results = "Multiple of 5";
//        }else {
//            results = "Odd";
//        }

        results = num % 2 == 0 ? "Even" :
                num % 3 == 0 ? "Multiple of 3" :
                        num % 5 == 0 ? "Multiple of 5" : "Odd";
        System.out.println(num + " is: " + results);
    }
}
