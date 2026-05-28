package cyclic_sort;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
// Google
public class NumbersDisappeared {

    static List<Integer> missingNumbers(int[] nums) {

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

        List<Integer> list = new ArrayList<>();

        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index + 1) {
                list.add(index + 1);
            }
        }

        return list;
    }


    public static void main(String[] args) {

        System.out.println(missingNumbers(new int[]{4, 3, 2, 7, 8, 2, 3, 1}));
    }
}
