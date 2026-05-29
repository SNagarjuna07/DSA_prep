package math;

import java.util.ArrayList;
import java.util.List;

public class Factors {

    // O (n)
    static void factors(int n) {

        for (int i = 1; i <= n; i++) {

            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
    }

    // O (sqrt(n))
    // Output not sorted
    static void factors1(int n) {

        for (int i = 1; i <= Math.sqrt(n); i++) {

            if (n % i == 0) {

                if (n / i == i) {
                    System.out.print(i + " "); // 6 * 6 = 36, so instead of printing 6 2 times, add this check
                } else {
                    System.out.print(i + " " + n / i + " ");
                }
            }
        }
    }

    // Time and space both will be O (sqrt(n))
    // Sorted
    static void factors2(int n) {

        List<Integer> ans = new ArrayList<>();

        for (int i = 1; i <= Math.sqrt(n); i++) {

            if (n % i == 0) {

                if (n / i == i) {
                    System.out.print(i + " "); // 6 * 6 = 36, so instead of printing 6 2 times, add this check
                } else {
                    System.out.print(i + " ");
                    ans.add(n / i);
                }
            }
        }

        for (int i = ans.size() - 1; i >= 0 ; i--) {

            System.out.print(ans.get(i) + " ");
        }
    }


    static void main() {

        int n = 36;

        factors(n);

        System.out.println();

        factors1(n);

        System.out.println();

        factors2(n);
    }
}
