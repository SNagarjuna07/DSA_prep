package binary_search;

public class CeilingNumber {

    // smallest number >= target
    static int ceiling(int[] nums, int target) {

        // what if target is > greatest number?
        if (target > nums[nums.length - 1]) {
            return -1;
        }

        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                return nums[mid];
            } else if (nums[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return nums[start];
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 5, 8, 13, 14, 16, 18, 20};
        int target = 15;
        System.out.println(ceiling(nums, target));
    }
}
