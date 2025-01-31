package heap_sort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double[] salaryDemands = {65000, 85000, 52000, 95000, 60000, 72000, 58000};

        System.out.println("Original Salaries: " + Arrays.toString(salaryDemands));
        HeapSort heapSort=new HeapSort();
        heapSort.heapSorting(salaryDemands);

        System.out.println("Sorted Salaries: " + Arrays.toString(salaryDemands));
    }
}
