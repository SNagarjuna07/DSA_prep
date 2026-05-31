package assignment;

//https://leetcode.com/problems/power-of-three/
public class PowerOfThree {

    static boolean isPowerOfThree(int n) {

        return n > 0 && 1162261467 % n == 0; // THe highest power of 32-bit int of 3. So all the powers are a factor
    }

    static void main() {

        int n = 81;

        System.out.println(isPowerOfThree(n));

    }
}
