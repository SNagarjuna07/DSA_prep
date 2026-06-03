package assignment;

public class ReduceToZero {

    static int reduce(int n) {
        return helper(n, 0);
    }

    static int helper(int n, int steps) {

        if (n == 0) {
            return steps;
        }

        // If n is even, return the number divided by 2 with incremented steps
        if (n % 2 == 0) {
            return helper(n / 2, ++steps);
        }

        // If it is odd, decrement it and increment steps
        return helper(--n, ++steps);
    }

    static void main() {

        int n = 14;

        System.out.println(reduce(n));

    }
}
