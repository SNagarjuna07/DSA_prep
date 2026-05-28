package recursion;

public class Binary_Search {

    static int search(int[] nums, int target, int start, int end) {

        // base case
        if (start > end) {
            return -1; // Element not found
        }

        int mid = start + (end - start) / 2;

        if (nums[mid] == target) {
            return mid;

        } else if (nums[mid] > target) {
            return search(nums, target, 0, mid - 1);
        }

        return search(nums, target, mid + 1, nums.length - 1);
    }

    static void main() {

        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8};

        System.out.println(search(nums, 0, 0, nums.length - 1));
    }
}
