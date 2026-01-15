package upstart;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Solution for counting elements where x+1 also exists in the array.
 */
public class CountElements {

    /**
     * Counts how many elements x exist such that x + 1 is also in the array.
     * Each duplicate occurrence of x is counted separately.
     *
     * @param arr the input array
     * @return count of elements where x+1 exists
     */
    public int countElements(int[] arr) {
        if (arr == null || arr.length == 0) {
            return 0;
        }

        // add all numbers to a set
        Set<Integer> set = new HashSet<>();
        for (int i : arr) {
            set.add(i);
        }

        // iterate through array, if n+1 is in the set, increment the count
        int count = 0;
        for (int i:arr) {
            if (set.contains(i+1)) {
                count++;
            }
        }

        return count;
    }
}