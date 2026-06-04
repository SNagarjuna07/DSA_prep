package recursion.arrays;

import java.util.ArrayList;
import java.util.List;

public class SearchReturnList {

    static List<Integer> search(int[] arr, int target, int idx, List<Integer> list) {

        if (idx > arr.length - 1) {
            return list;
        }

        if (arr[idx] == target) {
            list.add(idx);
        }

        return search(arr, target, ++idx, list);
    }

    static void main() {

        int[] arr = {1, 2, 3, 3, 4, 6, 5, 7};

        int target = 3;

        int idx = 0;

        System.out.println(search(arr, target, idx, new ArrayList<>()));
    }
}
