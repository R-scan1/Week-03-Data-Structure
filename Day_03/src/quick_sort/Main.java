package quick_sort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double[] productPrices = {550.75, 299.99, 120.49, 899.00, 450.25, 750.60, 99.99};

        System.out.println("Original Prices: " + Arrays.toString(productPrices));
        QuickSort quickSort=new QuickSort();
        quickSort.quickSort1(productPrices, 0, productPrices.length - 1);

        System.out.println("Sorted Prices: " + Arrays.toString(productPrices));
    }
}
