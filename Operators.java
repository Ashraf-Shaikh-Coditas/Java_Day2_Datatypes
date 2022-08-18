package Week1.Day2;

public class Operators {
    public static void main(String[] args) {
        // Unary operators.
        int a = 10;
        System.out.println(a++);
        System.out.println(a--);

        int b = 12;
        System.out.println(++b);
        System.out.println(--b);

        // Relational Operators
        System.out.println(10 > 9);
        System.out.println(10 >= 9);
        System.out.println(10 < 9);

        System.out.println(10 <= 9);
        System.out.println(10 == 9);
        System.out.println(10 != 9);

        // Bitwise Operators

        System.out.println(1 & 1);
        System.out.println(0 | 0);
        System.out.println(1 ^ 0);

        // Logical Operators
        System.out.println( true && true);
        System.out.println(false || true);

        // Assignment operators
        a = 11;
        a += 2 ; // a = a + 2;
        a -= 3 ;  // a = a - 3;

    }
}

/*

10
11

13
12

true
true
false

false
false
true

1
0
1

true
true


* */