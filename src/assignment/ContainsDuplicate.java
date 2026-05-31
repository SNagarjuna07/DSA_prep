package assignment;

import java.util.HashSet;
import java.util.Set;

//https://leetcode.com/problems/contains-duplicate/
public class ContainsDuplicate {

    static boolean containsDuplicate(int[] nums) {

        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (!set.add(num)) {
                return true;
            }
        }

        return false;
    }

    static void main() {

        int[] nums = {1, 2, 3, 2, 5};

        System.out.println(containsDuplicate(nums));
    }
}
