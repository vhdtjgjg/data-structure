package chapter1.part3;

import java.util.Iterator;
import java.util.Scanner;

public class Queue<T> implements Iterable<T> {

    /**
     * 指向最早添加的元素
     */
    private Node first;

    /**
     * 指向最近添加的元素
     */
    private Node last;

    /**
     * 队列中的元素数量
     */
    private int N;

    public boolean isEmpty(){
        return first==null;
    }

    public int size(){
        return N;
    }

    /**
     * 向队尾添加元素
     * @param item
     */
    public void enqueue(T item){

        Node oldLast=last;
        last=new Node();
        last.next=null;
        last.item=item;

        if(isEmpty()){
            first=last;
        }else {
            oldLast.next=last;
        }

        N++;
    }

    /**
     * 从表头删除元素
     * @return
     */
    public T dequeue(){

        T item = first.item;
        first=first.next;
        if(isEmpty()){
            last=null;
        }
        N--;

        return item;
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

        Queue<String> strings = new Queue<>();


        while (scanner.hasNext()){

            String item = scanner.nextLine();

            System.out.println(item);

            if("end".equals(item)){
                System.out.println("finished!");
                break;
            }

            if(!item.equals("-")){
                strings.enqueue(item);
            }else if (!strings.isEmpty()){
                System.out.println(strings.dequeue());
            }


        }
    }
}
