package assignment;

//https://leetcode.com/problems/power-of-four/
public class PowerOfFour {

    static boolean isPowerOfFour(int n) {

        return n > 0 && (n & (n - 1)) == 0 && ((n - 1) % 3) == 0;
    }

    static void main() {

        int n = 64;

        System.out.println(isPowerOfFour(n));

    }
}
