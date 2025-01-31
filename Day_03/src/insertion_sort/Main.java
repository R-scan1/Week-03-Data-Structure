package insertion_sort;

public class Main {
    public static void main(String[] args) {
        int [] id={110,109,101,104,107,109,105};
        InsertionSort insertionSort=new InsertionSort();
        int [] sortedID=insertionSort.sort(id);
        insertionSort.display(sortedID);
    }
}
