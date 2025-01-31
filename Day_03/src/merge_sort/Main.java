package merge_sort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1000,1200,900,200,1500,500};
        MergeSort mergeSort=new MergeSort();
        mergeSort.mergeSort1(arr, 0, arr.length - 1);
        System.out.println("Sorted Prices od Books: "+Arrays.toString(arr));

    }
}
