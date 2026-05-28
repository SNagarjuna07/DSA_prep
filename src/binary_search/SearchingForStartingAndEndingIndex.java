package binary_search;

import java.util.Arrays;

public class SearchingForStartingAndEndingIndex {

    public static int[] searchRange(int[] nums, int target) {

        int[] ans = {-1, -1};

        ans[0] = search(nums, target, true);
        ans[1] = search(nums, target, false);

        return ans;
    }

    static int search(int[] nums, int target, boolean searchingForStart) {

        int ans = -1;
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                ans = mid;
                if (searchingForStart) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {

        System.out.println(Arrays.toString(searchRange(new int[]{2, 2}, 2)));
    }
}
