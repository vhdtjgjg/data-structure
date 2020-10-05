import java.io.Serializable;
import java.util.EmptyStackException;

/**
 * 栈的链式实现
 */
public class LinkedStack<T> implements Stack<T>, Serializable {

    private Node<T> top;

    private int size;

    public LinkedStack() {
        this.top=new Node<>();
    }

    public int size(){
        return size;
    }

    public boolean isEmpty() {
        return top==null||top.data==null;
    }

    public void push(T data) {
        if(data==null){
            throw new StackException("传入数据不能为空");
        }
        if(this.top==null){//调用pop()后top可能为null
            this.top=new Node<>(data);
        }else if(this.top.data==null){
            this.top.data=data;
        }else {
            Node<T> tNode = new Node<>(data, this.top);
            top=tNode;  //更新栈顶
        }
        size++;
    }

    public T peek() {
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return top.data;
    }

    public T pop() {
        if(isEmpty()){
            throw new EmptyStackException();
        }

        T data=top.data;
        top=top.next;
        size--;
        return data;
    }

    public static void main(String[] args) {
        LinkedStack<String> stringLinkedStack = new LinkedStack<>();
        stringLinkedStack.push("A");
        stringLinkedStack.push("B");
        stringLinkedStack.push("C");

        int length = stringLinkedStack.size();

        for (int i=0;i<length;i++){
            System.out.println("pop -> "+stringLinkedStack.pop());
        }
    }
}
