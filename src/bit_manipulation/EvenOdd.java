package bit_manipulation;

public class EvenOdd {

    static String isEven(int n) {

        return (n & 1) == 0 ? "Even" : "Odd";
    }

    static void main() {

        int n = 6;

        System.out.println(isEven(n));

        System.out.println(Integer.toBinaryString(45));
        System.out.println(Integer.toBinaryString(44));
    }
}
