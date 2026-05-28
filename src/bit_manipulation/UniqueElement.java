package bit_manipulation;

// NOTE: Works for numbers repeated even number of times
public class UniqueElement {

    static int unique(int[] nums) {

        int unique = 0;

        for (int i : nums) {
            unique ^= i;
        }

        return unique;
    }

    static void main() {

        int[] nums = {2, 2, 1, 1, 6, 5, 4, 5, 4};

        System.out.println(unique(nums));
    }
}
