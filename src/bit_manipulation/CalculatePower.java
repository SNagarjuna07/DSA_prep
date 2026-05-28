package bit_manipulation;

public class CalculatePower {

    // Not optimized
    static int power(int base, int n) {

        int ans = 1;

        for (int i = 1; i <= n; i++) {
            ans *= base;
        }

        return ans;
    }

    // Optimized
    static int pow(int base, int n) {

        int ans = 1;

        while (n > 0) {

            if ((n&1) == 1) {
                ans *= base;
            }

            base *= base; // because 2^0, 2^1 etc.

            n >>= 1;
        }

        return ans;
    }

    static void main() {

        System.out.println(power(2, 5));

        System.out.println(power(2, 5));
    }
}
