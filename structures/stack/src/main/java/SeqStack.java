import java.io.Serializable;
import java.util.EmptyStackException;

/**
 * 顺序栈的实现
 */
public class SeqStack<T> implements Stack<T>, Serializable {

    /**
     * 栈顶指针，-1代表空栈
     */
    private int top=-1;

    /**
     * 容量大小默认为10
     */
    private int capacity=10;

    /**
     * 存放元素的数组
     */
    private T[] array;

    private int size;

    public SeqStack(int capacity){
        array= (T[]) new Object[capacity];
    }

    public SeqStack(){
        array= (T[]) new Object[capacity];
    }

    public int size(){
        return size;
    }

    public boolean isEmpty() {

        return top==-1;
    }

    /**
     * 添加元素，从栈顶（数组尾部）插入
     * 容量不足时，需要扩容
     * @param data
     */
    public void push(T data) {
        //判读容量是否充足
        if(array.length==size){
            ensureCapacity(size*2+1);//扩容
        }

        //从栈顶添加元素
        array[++top]=data;

        size++;
    }

    private void ensureCapacity(int capacity) {
        //如果需要拓展的容量比现在数组的容量还小，则无需扩容
        if(capacity<size){
            return;
        }
        T[] old=array;
        array=(T[])new Object[capacity];
        //复制元素
        for(int i=0;i<size;i++){
            array[i]=old[i];
        }
    }

    public T peek() {
        if(isEmpty()){
           throw new EmptyStackException();
        }
        return array[top];
    }

    public T pop() {
        if(isEmpty()){
            throw new EmptyStackException();
        }
        size--;
        return array[top--];
    }

    public static void main(String[] args) {
        SeqStack<String> stringSeqStack = new SeqStack<String>();
        stringSeqStack.push("A");
        stringSeqStack.push("B");
        stringSeqStack.push("C");
        System.out.println("size->"+stringSeqStack.size());
        int l=stringSeqStack.size();
        for(int i=0;i<l;i++){
            System.out.println("s.pop->"+stringSeqStack.pop());
        }

        System.out.println("s.peek -> "+stringSeqStack.peek());
    }
}
