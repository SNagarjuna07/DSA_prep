package binary_search;

public class FloorNumber {

    // Larget number <= target
    static int floor(int[] nums, int target) {

        // what if target is < smallest number?
        if (target < nums[nums.length - 1]) {
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

        return nums[end];
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 5, 8, 13, 14, 16, 18, 20};
        int target = 15;
        System.out.println(floor(nums, target));
    }
}

