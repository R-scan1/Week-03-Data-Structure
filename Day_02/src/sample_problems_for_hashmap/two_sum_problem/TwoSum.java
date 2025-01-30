package sample_problems_for_hashmap.two_sum_problem;

import java.util.HashMap;

public class TwoSum {
    public int[] findTwoSum(int[] nums, int target) {
        HashMap<Integer, Integer> numMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (numMap.containsKey(complement)) {
                return new int[]{numMap.get(complement), i}; // Return indices
            }

            numMap.put(nums[i], i);
        }

        return new int[]{};
    }
}
