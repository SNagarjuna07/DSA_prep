package binary_search;

public class OrderAgnosticBS {

    static int orderAgnosticBS(int[] nums, int target) {

        int start = 0;
        int end = nums.length - 1;

        // find whether array is sorted in ascending or descending
        boolean isAscending = nums[start] <= nums[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // If asc or des, both common
            if (target == nums[mid]) {
                return mid;
            }

            if (isAscending) {
                if (target > nums[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                if (target < nums[mid]) {
                    start = mid + 1;
                } else  {
                    end = mid - 1;
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] nums = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45 ,89};
        int target = 22;
        System.out.println(orderAgnosticBS(nums, target));


        int[] numsDes = {99, 80, 75, 22, 11, 10, 5, 2, -3};
        int targetDes = 22;
        System.out.println(orderAgnosticBS(numsDes, targetDes));
    }
}
