package math;

public class NewtonRaphsonSqrt {

    static double sqrt(double n) {

        double x = n;

        double root;

        while(true) {
            root = 0.5 * (x + (n / x));

            if (Math.abs(root - x) < 0.5) {
                break;
            }

            x = root;
        }

        return root;
    }

    static void main() {

        double n = 40.0;

        System.out.println(sqrt(n));
    }
}
