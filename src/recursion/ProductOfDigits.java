package recursion;

public class ProductOfDigits {

    static int prod(int n) {

        if (n == 1) {
            return 1;
        }

        return (n % 10) * prod((n / 10));

    }

    static void main() {

        int n = 1342;

        System.out.println(prod(n));

    }
}

