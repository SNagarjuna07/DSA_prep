package recursion.arrays;

public class RotatedBinarySearch {

    static int search(int[] arr, int target, int start, int end) {

        if (start > end) {
            return -1;
        }

        int mid = start + (end - start) / 2;

        if (arr[mid] == target) {
            return mid;
        }

        // Check if first half is sorted
        if (arr[start] <= arr[mid]) {

            // Case 1: target lies in first half
            if (target >= arr[start] && target <= arr[mid]) {
                return search(arr, target, start, mid - 1);
            } else {

                // Case 2: target lies in second part
                return search(arr, target, mid + 1, end);
            }
        }

        // Search in second half
        if (target > arr[mid] && target < arr[end]) {
            return search(arr, target, mid + 1, end);
        }

        // Search first half
        return search(arr, target, start, mid - 1);
    }

    static void main() {

        int[] arr = {5, 6, 7, 8, 9, 1, 2, 3};

        int target = 9;

        System.out.println(search(arr, target, 0, arr.length- 1));

    }
}
