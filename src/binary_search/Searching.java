package binary_search;

public class Searching {

    public static int binary_search(int[] nums, int target) {

        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2; // Prevents int overflow

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] nums = {1, 3 ,5 ,7 ,9, 11};

        int target = 7;

        System.out.println(binary_search(nums, target));
    }
}
