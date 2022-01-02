package problem.N300.P225_implement_stack_using_queues;

import java.util.LinkedList;
import java.util.Queue;

public class MyStack {

    Queue<Integer> integerQueue;


    /** Initialize your data structure here. */
    public MyStack() {

        integerQueue = new LinkedList<Integer>();
    }

    /** Push element x onto stack. */
    public void push(int x) {

        int size = integerQueue.size();

        integerQueue.add(x);

        for(int i=0;i<size;i++){
            integerQueue.add(integerQueue.poll());
        }
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {

        return integerQueue.poll();
    }

    /** Get the top element. */
    public int top() {


        return integerQueue.peek();
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {

        return integerQueue.isEmpty();
    }
}