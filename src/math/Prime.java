package math;

public class Prime {

    // Not optimized
    static boolean isPrime(int n) {

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Optimized
    static boolean prime(int n) {

        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    static void main() {

        int n = 5;

        System.out.println(isPrime(n));

        System.out.println(prime(n));
    }
}
