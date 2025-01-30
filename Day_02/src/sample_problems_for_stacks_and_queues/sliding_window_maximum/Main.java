package sample_problems_for_stacks_and_queues.sliding_window_maximum;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [] nums={2,3,6,1,-2,-4,9,6,8};
        int k = 3;
        CalculateMax calculateMax=new CalculateMax();
        int[] result = calculateMax.slidingWindow(nums, k);
        System.out.println(Arrays.toString(result));
    }
}
