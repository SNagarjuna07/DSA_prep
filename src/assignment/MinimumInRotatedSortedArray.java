package assignment;

// Used BS
//https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/
class MinimumInRotatedSortedArray {

    public static int findMin(int[] nums) {

        int pivot = findPivot(nums);

        // Array is not rotated
        if (pivot == -1) {
            return nums[0];
        }

        return nums[pivot + 1];
    }

    static int findPivot(int[] nums) {

        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            // Case 1: mid is pivot
            if (mid < end && nums[mid] > nums[mid + 1]) {
                return mid;
            }

            // Case 2: mid-1 is pivot
            if (mid > start && nums[mid] < nums[mid - 1]) {
                return mid - 1;
            }

            // Left side sorted -> pivot on right
            if (nums[mid] >= nums[start]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        System.out.println(findMin(new int[]{2, 1}));
    }
}