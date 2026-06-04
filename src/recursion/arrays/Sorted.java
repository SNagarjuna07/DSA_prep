package recursion.arrays;

public class Sorted {

    // Iterative approach
    static boolean isSorted(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }

        return true;
    }

    // Recursive approach
    static boolean sorted(int[] arr) {

        return helper(arr, 0);
    }

    static boolean helper(int[] arr, int idx) {

        if (idx == arr.length - 1) {
            return true;
        }

        return arr[idx] < arr[idx + 1] && helper(arr, ++idx);
    }

    static void main() {

        int[] arr = {1, 2, 4, 8, 9, 12};

        System.out.println(isSorted(arr));

        System.out.println(sorted(arr));
    }
}
