package recursion;

public class OneToN {

    static void print(int n) {

        if (n == 0) {
            return;
        }

        print(n - 1);

        System.out.println(n);

    }

    static void main() {

        print(5);
    }
}
