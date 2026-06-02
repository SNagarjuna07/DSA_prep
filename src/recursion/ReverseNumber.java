package recursion;

public class ReverseNumber {

    static int sum = 0;

    static void reverse(int n) {

        if (n == 0) {
            return;
        }

        int rem = n % 10;

        sum = (sum * 10) + rem;

        reverse(n / 10);
    }

    static void main() {

        int n = 123;

        reverse(n);

        System.out.println(sum);
    }
}
