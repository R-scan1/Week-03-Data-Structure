package sample_problems_for_hashmap.find_all_subarrays_with_zero_sum;

import java.util.*;

class SubArray {
    public void findZeroSumSubarrays(int[] arr) {
        Map<Integer, List<Integer>> sumMap = new HashMap<>();
        int sum = 0;

        sumMap.put(0, new ArrayList<>(List.of(-1)));

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];


            if (sumMap.containsKey(sum)) {
                for (int start : sumMap.get(sum)) {
                    System.out.println("Found zero-sum subarray: " +
                            Arrays.toString(Arrays.copyOfRange(arr, start + 1, i + 1)));
                }
            }

            sumMap.putIfAbsent(sum, new ArrayList<>());
            sumMap.get(sum).add(i);

        }
    }

}