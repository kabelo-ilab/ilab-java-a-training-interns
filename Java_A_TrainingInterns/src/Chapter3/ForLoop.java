package Chapter3;
/*
* Use a For Loop when you know the number of
* times that the loop / statements should be executed*/
public class ForLoop {
    public static void main(String[] args) {
        //display Tuesday 4 times
        for(int x = 1; x <= 4; x++){
            System.out.println(x + " - Tuesday");
        }
        System.out.println("+++++++++++++++++++++++++++++++++++++");
        //display iLAB Training 3 times
        for(int x = 5; x < 8; x++){
            System.out.println("iLAB Training");
        }
        System.out.println("+++++++++++++++++++++++++++++++++++++");
        //multiple loop conditions
        for(int a = 1, b = 5; a <= 5 || b <= 8; a++, b++){
            System.out.println("a - " + a + "\tb - " + b);
            //a - 1, 2, 3, 4, 5....6
            //b - 5, 6, 7, 8... 9.....10
        }
        System.out.println("+++++++++++++++++++++++++++++++++++++");
        //display numbers from 10 to 1
        for(int c = 10; c >= 0; c--){
            System.out.print(c + "  ");
        }
    }
}
