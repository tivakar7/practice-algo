package algo.arrays;

/**
 * Find the Missing Number
 * You are given a list of n-1 integers and these integers are in the range of 1 to n.
 * There are no duplicates in list. One of the integers is missing in the list.
 * Write an efficient code to find the missing integer.
 * <p>
 * <p>
 * Example:
 * I/P    [1, 2, 4, ,6, 3, 7, 8]
 * O/P    5
 */

/**
 * Created by tivakar on 5/23/17.
 */
public class MissingElementSorted {
    public int missing(int[] a, int start, int end) {
        // base condition
        if (start == end) {
            if (a[start] == start + 1) return start + 1;
            else return start - 1;

            int mid = start + end / 2;
            if (a[mid] == mid + 1) return missing(a, mid + 1, e);
            else return missing(a, s, mid - 1);
        }
    }

    public static void main(String[] args) {
        MissingElementSorted missingElementSorted = new MissingElementSorted();
        System.out.println(missingElementSorted.missing(new int[]{1,2,4}, 0, 2));
    }
}