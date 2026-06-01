package recursion;

public class SumOfDigits {

    static int sum(int n) {

        if (n == 0) {
            return 0;
        }

        return (n % 10) + sum((n / 10));

    }

    static void main() {

        int n = 1342;

        System.out.println(sum(n));

    }
}
