package sample_problems_for_stacks_and_queues.sort_a_stack_using_recursion;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer>stack=new Stack<>();
        stack.push(6);
        stack.push(2);
        stack.push(7);
        stack.push(9);
        stack.push(1);
        stack.push(3);

        StackSortOperation stackSortOperation=new StackSortOperation();
        System.out.println("Stack Before Sorting: "+stack);
        stackSortOperation.sort(stack);
        System.out.println("Sorted Stack: "+stack);
    }
}
