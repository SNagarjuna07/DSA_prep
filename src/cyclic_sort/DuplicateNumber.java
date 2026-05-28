package cyclic_sort;

//https://leetcode.com/problems/find-the-duplicate-number/
// Amazon, Microsoft
public class DuplicateNumber {

    static int duplicateNumber(int[] nums) {

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

//            value should be at index + 1 pos [1, n]
            if (nums[index] != index + 1) {
                return nums[index];
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println(duplicateNumber(new int[]{1, 3, 4, 2, 2}));
    }
}
