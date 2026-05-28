package bit_manipulation;

// Amazon
public class NthMagicNumber {

    static int magicNumber(int n) {

        int magicNo = 0;

        int base = 5;

        while (n > 0) {
            int last = n & 1; // Take last digit
            n >>= 1; // Ignore that last one
            magicNo += last * base; // Add the result with 5^base
            base *= 5; // Multiply base by 5
        }

        return magicNo;
    }

    static void main() {

        int n = 6;

        System.out.println(magicNumber(n));

    }
}
