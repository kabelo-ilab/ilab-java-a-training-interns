package Chapter2;

public class DecisionMakingLogic {
    public static void main(String[] args) {

        //single if-statement
        System.out.println("============single if-statement=================");
        if(3 < 2)
            System.out.println("3 is greater than 2");
        System.out.println("iLAB Training");


        if(5 != 7){
            System.out.println("Yes, 5 is not equals to 7");
            System.out.println("Please change the condition");
        }

        //binary if-statement
        System.out.println("============binary if-statement=================");
        if(3 == 3){
            System.out.println("Yes, 3 is equals to 3");
        }else{
            System.out.println("No, 3 can only be equals to 3");
        }
        //if...else if
        System.out.println("============if...else if=================");
        int age = 25;
        if(age >= 25){
            System.out.println("Old enough");
        }else if(age <= 25 &&  age >= 21){
            System.out.println("Almost there...");
        }else if (age == 16){
            System.out.println("5 more years to go");
        }
    }
}
