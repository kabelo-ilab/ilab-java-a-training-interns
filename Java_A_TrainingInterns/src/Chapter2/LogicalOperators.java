package Chapter2;

public class LogicalOperators {
    public static void main(String[] args) {
        boolean a = true, b = true, c = false;
        int x = 5, y = 6, z = 3;
        boolean results;

        results = (a && b);//true
        System.out.println(results);
        results = (a || b);//true
        System.out.println(results);
        results = (a || b || c);//true
        System.out.println(results);
        results = (c && (a || b));//false
        System.out.println(results);
        results = (c || (x > z));//true
        System.out.println(results);
        System.out.println("===============================");
        //f || t
        results = ((c && a) || (x > z));//true
        System.out.println(results);
        //f || t
        results = ((x > y) || (c != a));//true
        System.out.println(results);
        /*
        * Rules - You cannot have:
        * T || T
        * F && F
        * */


    }
}
