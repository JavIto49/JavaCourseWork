public class ArithmeticOperators {
    public static void main(String[] args) {
        // Arithmetic Operators
        int x = 10;
        int y = 2;

        int a;
        int b;
        int c;
        int d;
        int e;

        a = x + y;
        b = x - y;

        c = x * y;
        d = x / y;

        e = x % y;

        System.out.println("Result of a: " + a + "\nResult of b: " + b);
        System.out.println("Result of c: " + c + "\nResult of d: " + d);
        System.out.println("Result of e: " + e);
        System.out.println();

        // Augmented Assignment Operators
        int f = 10;
        int g = 20;

        f += g;
        //f -= g;
        //f *= g;
        //f /= g;
        //f %= g;

        System.out.println(f);

        // Increment and Decrement Operators
        int j = 5;
        j--;
        j++;
        System.out.println(j);

        // Order of Operations [P-E-M-D-A-S]
        double result = 3 + 4 * (7 - 5) / 2.0;
        System.out.println(result);
    }
}
