package bit_manipulation;

public class XorFromZeroToN {

    static int xor(int n) {

        if (n % 4 == 0) {
            return n;
        }

        if (n % 4 == 1) {
            return 1;
        }

        if (n % 4 == 2) {
            return n + 1;
        }

        return 0;
    }

    static void main() {

        int n = 7; // XOR from 0 to 7

        System.out.println(xor(n));
    }
}
