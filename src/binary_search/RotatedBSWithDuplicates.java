package binary_search;

//https://leetcode.com/problems/search-in-rotated-sorted-array/submissions/2003858248/
// Amazon, Google
public class RotatedBSWithDuplicates {

    static int findPivot(int[] nums) {

        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            // case: 1
            if (mid < end && nums[mid] > nums[mid + 1]) {
                return mid;
            }

            // case: 2
            if (mid > start && nums[mid] < nums[mid - 1]) {
                return mid - 1;
            }

            if (nums[mid] == nums[start] && nums[mid] == nums[end]) {
                // Skip duplicates

                // Check whether start is a pivot, then skip
                if (mid > start && nums[start] > nums[start + 1]) {
                    return start;
                }
                start++;

                // Check whether end is a pivot, then skip
                if (mid < end && nums[end] < nums[end - 1]) {
                    return end - 1;
                }
                end--;
            }

            // Left is sorted, pivot will be in right
            else if (nums[start] < nums[mid] || (nums[start] == nums[mid] && nums[mid] > nums[end])) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;
    }

    static int search(int[] nums, int target) {

        int pivot = findPivot(nums);

        if (pivot == -1) {

            // Array is not rotated, i.e, sorted, just do normal BS
            return binarySearch(nums, target, 0, nums.length - 1);
        }

        // Array is rotated and you found 2 sorted arrays!
        if (nums[pivot] == target) {
            return pivot;
        }

        if (target >= nums[0]) {

            // Target >= nums[0] ? Search only till pivot coz all elements after pivot are smaller
            // Ex: [4, 5, 6, 7, 0, 1, 2]
            return binarySearch(nums, target, 0, pivot - 1);
        }

        // If not, search only from pivot + 1 to nums.length - 1
        return binarySearch(nums, target, pivot + 1, nums.length - 1);
    }

    static int binarySearch(int[] nums, int target, int start, int end) {
        while (start <= end) {
            // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                // ans found
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 2, 2, 3, 5, 6};
        System.out.println(findPivot(nums));
        System.out.println(search(nums, 2));
    }
}


