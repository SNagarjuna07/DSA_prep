package cyclic_sort;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/find-all-duplicates-in-an-array/
// Google, Microsoft
public class AllDuplicates {

    static List<Integer> allDuplicateNumbers(int[] nums) {

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
                list.add(nums[index]);
            }
        }

        return list;
    }


    public static void main(String[] args) {

        System.out.println(allDuplicateNumbers(new int[]{4, 3, 2, 7, 8, 2, 3, 1}));
    }
}
