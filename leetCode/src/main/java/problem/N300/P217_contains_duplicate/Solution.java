package problem.N300.P217_contains_duplicate;

import java.util.*;

public class Solution {

    public boolean containsDuplicate(int[] nums) {

        Set<Integer> integerSet = new HashSet<Integer>();

        for (int num : nums) {
            if(!integerSet.add(num)){
                return true;
            }
        }

        return false;
    }
}
