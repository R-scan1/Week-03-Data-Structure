package bubble_sort;

public class Main {
    public static void main(String[] args) {
        int [] marksArray={91,89,76,95,79,60,90};
        BubbleSort bubbleSort=new BubbleSort();
        int [] result=bubbleSort.sort(marksArray);
        bubbleSort.display(result);
    }
}
