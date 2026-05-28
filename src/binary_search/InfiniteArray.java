package binary_search;

// Amazon
public class InfiniteArray {

    static int range(int[] nums, int target) {

        // Start with a box of size 2 and multiply. So O(log n) (bottom up)
        int start = 0;
        int end = 1;

        while (target > nums[end]) {
            int newStart = end + 1;

            // previous end + grow exponentially sizeOfBox * 2
            end = end + (end - start + 1) * 2;

            start = newStart;
        }

        return infiniteBS(nums, target, start, end);
    }


    static int infiniteBS(int[] nums, int target, int start, int end) {

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

        System.out.println(range(new int[] {3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170}, 10));

    }
}
