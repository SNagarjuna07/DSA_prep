package cyclic_sort;

import java.util.Arrays;

//https://leetcode.com/problems/set-mismatch/
public class SetMismatch {

    static int[] missingNumbers(int[] nums) {

        int i = 0;

        while (i < nums.length) {

            int correct = nums[i] - 1;

            if (nums[i] != nums[correct]) {
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            } else {
                i++;
            }
        }

        for (int index = 0; index < nums.length; index++) {

            if (nums[index] != index + 1) {
                return new int[] {nums[index], index + 1};
                // nums[index] will be repeated, index + 1 will be the missing number
            }
        }

        return new int[]{};
    }

    static void main() {

        IO.println(Arrays.toString(missingNumbers(new int[]{1, 2, 2, 4 })));
    }
}
