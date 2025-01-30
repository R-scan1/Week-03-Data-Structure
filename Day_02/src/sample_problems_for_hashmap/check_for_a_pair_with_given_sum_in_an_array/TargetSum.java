package sample_problems_for_hashmap.check_for_a_pair_with_given_sum_in_an_array;

import java.util.HashSet;

public class TargetSum {
    public boolean hasPairWithSum(int[] nums, int target) {
        HashSet<Integer> numSet = new HashSet<>();

        for (int num : nums) {
            int complement = target - num;
            if (numSet.contains(complement)) {
                return true;
            }
            numSet.add(num);
        }

        return false;
    }
}
