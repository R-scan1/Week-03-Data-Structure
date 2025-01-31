package sample_problems_for_stacks_and_queues.sort_a_stack_using_recursion;

import java.util.Stack;

public class StackSortOperation {

     void sort(Stack <Integer> stack){
        if(!stack.isEmpty()){
            int temp=stack.pop();

            sort(stack);

            sortedStack(stack,temp);
        }
    }

    void  sortedStack(Stack<Integer> stack, int element) {
        if(stack.isEmpty() || stack.peek()<=element){
            stack.push(element);
        }else{
            int temp=stack.pop();

            sortedStack(stack,element);

            stack.push(temp);
        }
    }
}
