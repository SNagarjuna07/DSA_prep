package math;

// Sieve of Eratosthenes
public class Sieve {

    // O (n * log (log n))
    static void sieve(int n, boolean[] primes) {

        // false -> primes, true -> visited
        for (int i = 2; i <= Math.sqrt(n); i++) {

            // false -> check its multiples and change it to true
            if (!primes[i]) {
                for (int j = i * i; j <= n; j += i) { // i * i to skip the nos. which handled earlier
                    primes[j] = true;
                }
            }
        }

        // Print primes
        for (int i = 2; i <= n ; i++) {
            if (!primes[i]) {
                System.out.print(i + " ");
            }
        }
    }

    static void main() {

        int n = 40;

        boolean[] primes = new boolean[n + 1];

        sieve(n, primes);
    }

}
