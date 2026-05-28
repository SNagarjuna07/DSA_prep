package bit_manipulation;

public class OnlyPositive {

    static int positive(int[] nums) {

        int sum = 0;

        for (int i : nums) {
            sum += i;
        }

        return sum;
    }

    static void main() {

        int[] nums = {2, 3, -2, -4, 4, 5, -5};

        System.out.println(positive(nums));
    }
}
