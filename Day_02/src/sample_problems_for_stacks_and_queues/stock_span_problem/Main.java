package sample_problems_for_stacks_and_queues.stock_span_problem;

public class Main {
    public static void main(String[] args) {
        int[] prices = {10,4,5,90,120,80};
        Span span=new Span();
        int[] span1 = span.calculateSpan(prices);

        for (int s : span1) {
            System.out.print(s + " ");
        }
    }
}
