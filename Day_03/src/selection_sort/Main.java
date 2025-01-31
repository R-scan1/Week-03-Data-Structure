package selection_sort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] examScores = {88, 72, 95, 60, 85, 78, 90};
        System.out.println("Original Scores: " + Arrays.toString(examScores));
        SelectionSort selectionSort=new SelectionSort();
        selectionSort.selectionSorting(examScores);
        System.out.println("Sorted Scores: " + Arrays.toString(examScores));
    }
}
