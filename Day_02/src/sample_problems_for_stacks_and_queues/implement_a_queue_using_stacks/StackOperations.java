package sample_problems_for_stacks_and_queues.implement_a_queue_using_stacks;

import java.util.Iterator;
import java.util.Stack;

public class StackOperations {
      Stack<Integer>enqueue1=new Stack<>();
      Stack<Integer>dequeue1=new Stack<>();


      void enqueue(int a){
          enqueue1.push(a);
      }

      int dequeue(){
          if(enqueue1.isEmpty()){
              System.out.println("Queue is already empty");
              return -1;
          }
              while(!enqueue1.isEmpty()){
                  dequeue1.push(enqueue1.pop());
              }
              int ele=dequeue1.pop();

              while(!dequeue1.isEmpty()){
                  enqueue1.push(dequeue1.pop());
              }

              return ele;
      }

      void display(){
          System.out.println("Queue:"+enqueue1);
      }
}
