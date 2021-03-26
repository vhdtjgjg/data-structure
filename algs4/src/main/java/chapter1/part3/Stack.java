package chapter1.part3;

import java.util.Iterator;
import java.util.Scanner;

public class Stack<T> implements Iterable<T> {

    /**
     * 栈顶，最近添加的元素
     */
    private Node first;

    /**
     * 元素数量
     */
    private int N;

    public boolean isEmpty(){
        return first==null;
    }

    public int size(){
        return N;
    }

    /**
     * 向栈顶添加元素
     * @param item
     */
    public void push(T item){

        Node oldFirst=first;
        first=new Node();
        first.next=oldFirst;
        first.item=item;
        N++;
    }

    public T pop(){

        T item = first.item;
        first=first.next;
        N--;

        return item;
    }

    public T peek(){

        if(isEmpty()){
            throw new RuntimeException("空栈");
        }

        return first.item;

    }


    @Override
    public Iterator<T> iterator() {
        return null;
    }

    /**
     * 定义了节点的嵌套类
     */
    private class Node {

        T item;
        Node next;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Stack<String> strings = new Stack<>();


        while (scanner.hasNext()){

            String item = scanner.nextLine();

            System.out.println(item);

            if("end".equals(item)){
                System.out.println("finished!");
                break;
            }

            if(!item.equals("-")){
                strings.push(item);
            }else if (!strings.isEmpty()){
                System.out.println(strings.pop());
            }


        }
    }
}
