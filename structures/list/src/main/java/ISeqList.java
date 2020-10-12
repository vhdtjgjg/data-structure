/**
 * 顺序表顶级接口
 */
public interface ISeqList<T> {

    /**
     * 判断链表是否为空
     * @return
     */
    boolean isEmpty();

    /**
     * 链表长度
     * @return
     */
    int length();

    /**
     * 获取元素
     * @param index
     * @return
     */
    T get(int index);

    /**
     * 根据index添加元素
     * @param index
     * @param data
     * @return
     */
    boolean add(int index,T data);

    /**
     * 添加元素
     * @param data
     * @return
     */
    boolean add(T data);

    /**
     * 根据
     * @param index
     * @return
     */
    boolean remove(int index);

    /**
     * 根据data移除元素
     * @param data
     * @return
     */
    boolean remove(T data);
}
