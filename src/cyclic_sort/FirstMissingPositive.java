package cyclic_sort;

//https://leetcode.com/problems/first-missing-positive/
public class FirstMissingPositive {

    static int firstMissingPos(int[] nums) {

        int i = 0;

        while (i < nums.length) {

            int correct = nums[i] - 1;

            // Ignore negatives, check if lies between 1 to N
            if (nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[correct]) {
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            } else {
                i++;
            }
        }

        for (int index = 0; index < nums.length; index++) {
            if(nums[index] != index + 1) {
                return index + 1;
            }
        }

        return nums.length + 1;
    }

    static void main() {

        System.out.println(firstMissingPos(new int[] {1, 2, 0}));
    }
}
