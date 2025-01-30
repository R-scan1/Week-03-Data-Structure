package sample_problems_for_hashmap.longest_consecutive_sequence;

public class Main {
    public static void main(String[] args) {
        int[] arr = {9, 5, 7, 1, 6, 2, 3, 8, 4};
        LongestSubsequence longestSubsequence=new LongestSubsequence();
        System.out.println("Longest Consecutive Sequence Length: " + longestSubsequence.longestConsecutive(arr));
    }
}
