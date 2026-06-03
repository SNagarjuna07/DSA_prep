package recursion;

public class CountZeros {

    // Iterative
    static int zeros(int n) {

        int count = 0;

        while (n > 0) {
            if (n % 10 == 0) {
                count++;
            }
            n /= 10;
        }

        return count;
    }

    // Recursive
    static int countZeros(int n) {

       return helper(n, 0);
    }

    static int helper(int n, int c) {

        if (n == 0) {
            return c;
        }

        int rem = n % 10;

        if (rem == 0) {
            return helper(n / 10, c + 1);
        }

        return helper(n / 10, c);
    }

    // Approach 2
    static int Zeros(int n, int count) {

        if (n == 0) {
            return count;
        }

        if (n % 10 == 0) {
            ++count;
        }

        return Zeros(n / 10, count);
    }

    static void main() {

        int n = 30204;

        System.out.println(zeros(n));

        System.out.println(countZeros(n));

        System.out.println(Zeros(n, 0));
    }
}
