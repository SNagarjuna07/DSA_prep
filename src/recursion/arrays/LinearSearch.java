package recursion.arrays;

public class LinearSearch {

    // Searching
    static boolean search(int[] arr, int target) {

        return helper(arr, 0, target);
    }

    static boolean helper(int[] arr, int idx, int target) {

        if (idx > arr.length - 1) {
            return false;
        }

        return arr[idx] == target || helper(arr, ++idx, target);
    }

    // Searching with idx value
    static int searchIdx(int[] arr, int target) {

        return helperIdx(arr, 0, target);
    }

    static int helperIdx(int[] arr, int idx, int target) {

        if (idx > arr.length - 1) {
            return -1;
        }

        if (arr[idx] == target) {
            return idx;
        }

        return helperIdx(arr, ++idx, target);
    }

    static void main() {

        int[] arr = {1, 2, 4, 8, 9, 12};

        int target = 8;

        System.out.println(search(arr, target));

        System.out.println(searchIdx(arr, target));
    }
}
