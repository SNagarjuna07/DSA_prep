package cyclic_sort;

import java.util.Arrays;

public class CyclicSort {

    static void sort(int[] nums) {

        int i = 0;

        while (i < nums.length) {

            int correct = nums[i] - 1;

            // Element at ith pos must be equal to its value - 1
            if (nums[i] != nums[correct]) {
                int temp = nums[correct];
                nums[correct] = nums[i];
                nums[i] = temp;
            } else {
                i++;
            }
        }
    }

    public static void main(String[] args) {

        int[] nums = {3, 0, 1};

        sort(nums);

        System.out.println(Arrays.toString(nums));

    }
}
