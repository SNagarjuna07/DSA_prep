package recursion;

public class Fibonacci {

    static int fib(int n) {

        if (n < 2) {
            return n;
        }

        return fib(n - 1) + fib(n - 2);
    }

    static void main() {

        System.out.println(fib(3));
    }
}
