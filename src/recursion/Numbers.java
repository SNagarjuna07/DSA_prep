package recursion;

public class Numbers {

    static void print(int n) {

        // Base case
        if (n == 5) {
            System.out.println(5);
            return;
        }

        System.out.println(n);

        print(n+1);
    }

    static void main() {

        // Print from 1 to 5 using recursion
        print(1);
    }
}
