package problem.N200.P155_min_stack;

import org.junit.Test;

import java.util.Stack;

public class MinStack {

    Stack<Integer> xStack;
    Stack<Integer> minStack;

    /** initialize your data structure here. */
    public MinStack() {

        xStack=new Stack<Integer>();

        minStack=new Stack<Integer>();
        minStack.push(Integer.MAX_VALUE);
    }

    public void push(int val) {

        xStack.push(val);
        minStack.push(Math.min(minStack.peek(),val));
    }

    public void pop() {

        xStack.pop();
        minStack.pop();
    }

    public int top() {

        return xStack.peek();
    }

    public int getMin() {

        return minStack.peek();
    }

    @Test
    public void test(){

        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        System.out.println(minStack.getMin());
        minStack.pop();
        System.out.println(minStack.top());
        System.out.println(minStack.getMin());
    }
}
