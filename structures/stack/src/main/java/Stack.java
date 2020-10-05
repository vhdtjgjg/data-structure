/**
 * https://blog.csdn.net/javazejian/article/details/53362993
 * 栈接口抽象数据类型
 */
public interface Stack<T> {

    /**
     * 栈是否为空
     * @return
     */
    boolean isEmpty();

    /**
     * data元素入栈
     * @param data
     */
    void push(T data);

    /**
     * 返回栈顶元素
     * @return
     */
    T peek();

    /**
     * 出栈，返回栈顶元素，同时从栈中移除元素
     * @return
     */
    T pop();
}
