package Chapter4;

/*Methods with return type will return the value back
* to the caller*/
public class ReturnTypeMethods {
    final static double RATE = 150;
    public static void main(String[] args) {
        System.out.println(getMessage());
    }

    static String getMessage(){
       return "Hi, welcome to Java Fundamentals Course";
    }

    static int getSum(){
        int num1, num2;
        num1 = 5;
        num2 = 6;
        return num1 + num2;
    }
    static double calcSalary(){
        int hoursWorked = 50;
        return hoursWorked * RATE;
    }

    static boolean isEven(){
        int num = 15;
        return  (num % 2 == 0);
    }


}
