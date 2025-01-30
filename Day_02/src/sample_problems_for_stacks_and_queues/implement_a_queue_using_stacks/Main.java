package sample_problems_for_stacks_and_queues.implement_a_queue_using_stacks;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        StackOperations stackOperations=new StackOperations();
        stackOperations.enqueue(1);
        stackOperations.enqueue(5);
        stackOperations.enqueue(4);
        stackOperations.enqueue(8);
        stackOperations.enqueue(9);
        stackOperations.enqueue(2);
        stackOperations.display();

        stackOperations.dequeue();
        stackOperations.dequeue();
        System.out.println("Queue after removing two element: ");
        stackOperations.display();

        System.out.println("Queue after adding two elements: ");
        stackOperations.enqueue(7);
        stackOperations.enqueue(1);

        stackOperations.display();

    }
}
