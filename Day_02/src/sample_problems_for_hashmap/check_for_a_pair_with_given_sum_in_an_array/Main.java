package sample_problems_for_hashmap.check_for_a_pair_with_given_sum_in_an_array;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 4, 8, 12, 6, 9};
        int target = 10;
        TargetSum targetSum=new TargetSum();
        System.out.println("Pair exists: " + targetSum.hasPairWithSum(arr, target));
    }
}
