package sample_problems_for_hashmap.two_sum_problem;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 7, 9};
        int target = 10;
        TwoSum twoSum=new TwoSum();
        int[] result = twoSum.findTwoSum(arr, target);
        if(result.length==2){
            System.out.println("Indices: " + result[0] + ", " + result[1]);
        }else{
            System.out.println("No pair found.");
        }
    }
}

