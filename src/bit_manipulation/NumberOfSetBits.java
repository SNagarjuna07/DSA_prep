package bit_manipulation;

public class NumberOfSetBits {

    // Not optimized
    static int set(int n) {

        int count = 0;

        while (n > 0) {

            if ((n & 1) == 1) {
                count++;
            }

            n >>= 1;
        }

        return count;
    }

    // Optimized
    static int setBits(int n) {

        int count = 0;

        while (n > 0) {
            count++;
            n = n & (n - 1);
        }

        return count;
    }

    static void main() {

        int n = 75;

        System.out.println(Integer.toBinaryString(n));

        System.out.println(set(n));

        System.out.println(setBits(n));
    }
}
