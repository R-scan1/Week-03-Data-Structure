package quick_sort;

public class QuickSort {
    public void quickSort1(double[] prices, int low, int high) {
        if (low < high) {
            int partitionIndex = partition(prices, low, high);

            quickSort1(prices, low, partitionIndex - 1);
            quickSort1(prices, partitionIndex + 1, high);
        }
    }

    public int partition(double[] prices, int low, int high) {
        double pivot = prices[high]; // Choosing the last element as pivot
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (prices[j] < pivot) {
                i++;
                double temp = prices[i];
                prices[i] = prices[j];
                prices[j] = temp;
            }
        }

        double temp = prices[i + 1];
        prices[i + 1] = prices[high];
        prices[high] = temp;

        return i + 1;
    }
}
