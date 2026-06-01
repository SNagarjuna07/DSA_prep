package recursion;

public class NToOne {

    static void print(int n) {

        if (n == 0) {
            return;
        }

        System.out.println(n);

        print(n - 1);
    }

    static void main() {

        print(5);
    }
}
