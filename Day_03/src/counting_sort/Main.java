package counting_sort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] studentAges = {13, 17, 15, 11, 10, 18, 14, 12, 16, 17, 11, 12};

        System.out.println("Original Ages: " + Arrays.toString(studentAges));
        CountingSort countingSort=new CountingSort();
        countingSort.countingSort1(studentAges, 10, 18);

        System.out.println("Sorted Ages: " + Arrays.toString(studentAges));
    }
}
