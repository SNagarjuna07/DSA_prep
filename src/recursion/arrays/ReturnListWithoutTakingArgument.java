package recursion.arrays;

import java.util.ArrayList;
import java.util.List;

public class ReturnListWithoutTakingArgument {

    static List<Integer> search(int[] arr, int target, int idx) {

        List<Integer> list = new ArrayList<>();

        if (idx > arr.length - 1) {
            return list;
        }

        // this will contain answer for that function call only
        if(arr[idx] == target) {
            list.add(idx);
        }

        List<Integer> callsFromBelow = search(arr, target, ++idx);

        list.addAll(callsFromBelow);

        return list;
    }

    static void main() {

        int[] arr = {1, 2, 3, 3, 4, 5};

        int target = 3;

        int idx = 0;

        System.out.println(search(arr, target, idx));
    }
}
