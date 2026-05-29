package bit_manipulation;

public class XORForRange {

    // This gives XOR from 0 to a
    static int Xor(int a) {

        if (a % 4 == 0) {
            return a;
        }

        if (a % 4 == 1) {
            return 1;
        }

        if (a % 4 == 2) {
            return a + 1;
        }

        return 0;
    }

    static void main() {

        int a = 3;
        int b = 9;

        System.out.println(Xor(b) ^ Xor(a -1));

//        int ans = 0;

//        // Just for check. For large numbers, TLE
//        for (int i = a; i <= b; i++) {
//            ans ^= i;
//        }

//        System.out.println(ans);
    }
}
