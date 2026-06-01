package recursion;

public class Factorial {

    static int fact(int n) {

        if (n < 2) {
            return 1;
        }

        return n * fact(n - 1);
    }

    static void main() {

        System.out.println(fact(5));
    }
}
