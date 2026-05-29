package assignment;

public class FindComplement {

    static int complement(int n) {

        int mask = 1;

        while (mask < n) {
            mask = (mask << 1) | 1; // Left shift until MSB, | 1 is for ensuring all bits of the mask are 1
        }

        return n ^ mask;
    }

    static void main() {

        int n = 5;

        System.out.println(Integer.toBinaryString(n));

        System.out.println(Integer.toBinaryString(complement(n)));

        System.out.println(complement(n));
    }
}
