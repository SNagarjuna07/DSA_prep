package bit_manipulation;

public class ithBit {

    static int bit (int n) {

        // left shift until n - 1 and 1 goes to the right place
        return n & (1 << (n - 1));
    }

    static void main() {

        int n = 5;

        System.out.println(bit(n));
    }
}
