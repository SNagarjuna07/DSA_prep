package binary_search;

// https://leetcode.com/problems/find-peak-element
public class PeakMountainIndex {

    static int peak(int[] nums) {

        int start = 0;
        int end = nums.length - 1;

        while (start < end) {

            int mid = start + (end - start) / 2;

            if (nums[mid] > nums[mid + 1]) {
                // you are in the descending part
                // this may be the answer, so end = mid
                end = mid;
            } else if (nums[mid] < nums[mid + 1]) {
                // you are in ascending part
                start = mid + 1;
            }
        }

        return start; // Because of 2 checks end = mid & start = mid + 1, both point at max element
    }

    public static void main(String[] args) {

        System.out.println(peak(new int[]{1, 2, 3, 5, 6, 4, 3, 2}));
        System.out.println(peak(new int[]{0, 1, 0, 0}));
    }
}
