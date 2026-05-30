package math;

public class GCD_LCM {

    static int gcd(int a, int b) {

        // base case
        if (a == 0) { // because GCD(0, any number) is 0
            return b;
        }

        return gcd(b % a, a);
    }

    static int lcm (int a, int b) {

        return (a * b) / gcd(a, b);
    }

    static void main() {

        int a = 4;
        int b = 8;

        System.out.println(gcd(a, b));

        System.out.println(lcm(a, b));
    }
}
