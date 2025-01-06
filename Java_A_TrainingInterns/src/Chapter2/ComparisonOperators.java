package Chapter2;

public class ComparisonOperators {
    public static void main(String[] args) {
        boolean results;

        results = (2 == 2.0);//equality - true
        System.out.println(results);
        results = (3 > 7);//greater than - false
        System.out.println(results);
        results = (8.0 >= 8);//greater / equals to - true
        System.out.println(results);
        results = (24 < 24);//less than - false
        System.out.println(results);
        results = (13 <= 23);//less / equals to - true
        System.out.println(results);
        results = (15 != 15);//Not equal - false
        System.out.println(results);
        results = (15 % 3 == 0);//modulus - is divisable - true
        System.out.println(results);

    }
}
