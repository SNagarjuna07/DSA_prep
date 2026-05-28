package assignment;

// Used Binary Search
//https://leetcode.com/problems/sqrtx
public class Sqrt {

    static int sqrt(int n) {

        int start = 0;
        int end = n;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (mid * mid == n) {
                return mid;
            } else if ( (long) mid * mid > n) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return end;
    }

    static void main() {

        int n = 16;

        System.out.println(sqrt(n));
    }
}
