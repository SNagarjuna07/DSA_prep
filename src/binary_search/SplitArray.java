package binary_search;

// https://leetcode.com/problems/split-array-largest-sum/
public class SplitArray {

    public static void main(String[] args) {
        System.out.println(splitArray(new int[] {7, 2, 5, 10, 8},2));
    }

    static int splitArray(int[] nums, int m) {
        int start = 0;
        int end = 0;

        for (int j : nums) {
            start = Math.max(start, j); // in the end of the loop this will contain the max item of the array
            end += j; // sum

            // So the range will be [max_No, sum]
        }

        // binary search
        while (start < end) {
            // try for the middle as potential ans
            int mid = start + (end - start) / 2;

            // calculate how many pieces you can divide this in with this max sum
            int sum = 0;
            int pieces = 1;
            for (int num : nums) {
                if (sum + num > mid) {
                    // you cannot add this in this subarray, make new one
                    // say you add this num in new subarray, then sum = num
                    sum = num;
                    pieces++;
                } else {
                    sum += num;
                }
            }

            if (pieces > m) {
                start = mid + 1;
            } else {
                end = mid;
            }

        }
        return end; // here start == end
    }
}
