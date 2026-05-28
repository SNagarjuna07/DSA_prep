package bit_manipulation;

public class PowerOfTwo {

    // Not optimized
    static boolean isPowerOfTwo(int n) {

        int count = 0;

        while (n > 0) {

            if (n >> 1 == 1) {
                count++;
            }

            n >>= 1;
        }

        return count == 1;
    }

    // Optimized
    // 0 is exception case
    static boolean isPower(int n) {

        return n > 0 && (n & (n - 1)) == 0;
    }

    static void main() {

        int n = 4;

        System.out.println(isPowerOfTwo(n));

        System.out.println(isPower(n));

    }
}
