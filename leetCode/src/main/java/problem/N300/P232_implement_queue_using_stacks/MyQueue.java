package problem.N300.P232_implement_queue_using_stacks;

import org.junit.Test;

import java.util.Stack;

public class MyQueue {

    Stack<Integer> stack;
    Stack<Integer> tempStack;

    /** Initialize your data structure here. */
    public MyQueue() {

        stack=new Stack<>();
        tempStack=new Stack<>();
    }

    /** Push element x to the back of queue. */
    public void push(int x) {



        int size = stack.size();

        for(int i=0;i<size;i++){
            Integer pop = stack.pop();
            tempStack.push(pop);
        }
        stack.push(x);
        for(int i=0;i<size;i++){
            Integer pop = tempStack.pop();
            stack.push(pop);
        }

    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {

        return stack.pop();
    }

    /** Get the front element. */
    public int peek() {

        return stack.peek();
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {

        return stack.isEmpty();
    }

    @Override
    public String toString() {

        StringBuilder stringBuilder = new StringBuilder();

        for (Integer integer : stack) {
            stringBuilder.append(integer).append("->");
        }


        return stringBuilder.substring(0,stringBuilder.length()-2);
    }

    @Test
    public void test(){

        MyQueue myQueue = new MyQueue();

        myQueue.push(1);
        myQueue.push(2);
        myQueue.push(3);
        myQueue.push(5);
        System.out.println(myQueue);
        System.out.println(myQueue.peek());
        System.out.println(myQueue.pop());

    }

}
