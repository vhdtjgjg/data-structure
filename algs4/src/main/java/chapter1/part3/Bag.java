package chapter1.part3;

import java.util.Iterator;
import java.util.Scanner;

public class Bag<T> implements Iterable<T> {

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
    public void add(T item){

        Node oldFirst=first;
        first=new Node();
        first.next=oldFirst;
        first.item=item;
    }

    @Override
    public Iterator<T> iterator() {
        return new ListIterator();
    }

    private class ListIterator implements Iterator<T>{

        private Node current=first;

        @Override
        public boolean hasNext() {
            return current!=null;
        }


        @Override
        public T next() {

            T item = current.item;

            current=current.next;

            return item;
        }


        @Override
        public void remove() {

        }
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

        Bag<String> strings = new Bag<>();


        while (scanner.hasNext()){

            String item = scanner.nextLine();

            System.out.println(item);

            if("end".equals(item)){
                System.out.println("finished!");
                break;
            }

            if(!item.equals("-")){
                strings.add(item);
            }
        }

        Iterator<String> iterator = strings.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
