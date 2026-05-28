package bit_manipulation;

// How many bits does a decimal number contain in its binary form?
public class NumberOfBits {

    // Not optimized
    static int countBits(int n) {

        int count = 0;

        while (n > 0) {
            count++;
            n >>= 1;
        }

        return count;
    }

    // Optimized
    static int count(int n) {
        // Change the value of 2 to get number of bits / digits in its number system
        return (int) (Math.log(n) / Math.log(2)) + 1;
    }

    static void main() {

        int n = 10;

        System.out.println(countBits(n));

        System.out.println(count(n));
    }
}
