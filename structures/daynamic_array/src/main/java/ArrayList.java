import java.util.Arrays;

/**
 * https://www.cnblogs.com/xiuzhublog/p/12608563.html
 *
 */
public class ArrayList<E> {

    //动态数组应该有数组长度和元素的索引两个成员变量

    /**
     * 元素的数量
     */
    private int size;

    /**
     * 所有的元素
     */
    private E[] elements;

    /**
     * 创建数组时的初始容量，容量大小根据实际情况确定，避免重复请求或者销毁内存
     */
    private static final int DEFAULT_CAPACITY=10;

    /**
     * 这里用来判定
     */
    private static final int ELEMENT_NOT_FOUND=-1;

    public ArrayList(int capacity){
        //如果实际需要的容量比默认的容量小，就使用默认容量
        capacity=(capacity<DEFAULT_CAPACITY)?DEFAULT_CAPACITY:capacity;
        elements= (E[]) new Object[capacity];
    }

    public ArrayList() {
        this(DEFAULT_CAPACITY);
    }

    /**
     * 清除所有元素
     */
    public void clear(){

        /**
         * 为了使动态数组可以存储多种类型的元素使用了泛型
         * 这样的话new的数组里每个内存的索引都必须清除
         * 否则内存中的元素依然可以访问到
         */
        for(int i=0;i<size;i++){
            elements[i]=null;
        }

        /**
         * 动态数组的使用过程中可能会反复的添加或删除元素，
         * 因此没有必要每次清空元素的时候都销毁数组所在的内存空间
         * 因为申请和销毁内存空间都是需要时间的
         *
         */
        size=0;
    }

    /**
     * 元素的数量
     * @return
     */
    public int size(){
        return size;
    }

    /**
     * 是否为空
     * @return
     */
    public boolean isEmpty(){
        return size==0;
    }

    /**
     * 是否包含某个元素
     * @param element
     * @return
     */
    public boolean contains(E element){
        return indexOf(element)!=ELEMENT_NOT_FOUND;
    }

    /**
     * 添加某个元素到尾部
     * @param element
     */
    public void add(E element){
        add(size,element);
    }

    /**
     * 在index位置插入一个元素
     * @param index
     * @param element
     */
    public void add(int index, E element) {
        
        //加这一行不允许存空值
//        if(element==null)
//            return;

        //插入元素之前先要判断输入的索引位置
        rangeCheck(index);

        ensureCapacity(size+1);

        for(int i=size;i>index;i--){
            elements[i]=elements[i-1];
        }

        elements[index]=element;
        size++;
    }


    /**
     * 删除index位置的元素
     * @param index
     * @return
     */
    public E remove(int index){

        rangeCheck(index);

        E old = elements[index];

        //需要往前挪的元素是index后一个到数组的最后一个
        for(int i=index+1;i<size;i++){
            elements[i-1]=elements[i];
        }
        //siez-1,后将末尾元素清空
        elements[size--]=null;
        return old;
    }

    /**
     * 保证要有capacity的容量
     * @param capacity
     */
    private void ensureCapacity(int capacity) {

        int oldCapacity = elements.length;

        if(oldCapacity>=capacity){
            return;
        }

        //新容量为旧容量的1.5倍
        int newCapacity = oldCapacity + (oldCapacity >> 1);
        E[] newElements=(E[])new Object[newCapacity];
        for(int i=0;i<size;i++){
            newElements[i]=elements[i];
        }
        elements=newElements;

        System.out.println(oldCapacity+"扩容为："+newCapacity);
    }

    /**
     * 添加元素时检测
     * @param index
     */
    private void rangeCheck(int index) {
        
        //插入元素时可以大于数组现有的长度
        if(index<0 || index>size){
            outOfBounds(index);
        }
    }

    private void outOfBounds(int index) {
        throw new IndexOutOfBoundsException("Index: "+index+",Size:"+size);
    }

    /**
     * 查看元素的索引
     * @param element
     * @return
     */
    public int indexOf(E element) {

        if(element==null){
            for(int i=0;i<size;i++){
                if(elements[i]==null){
                    return i;
                }
            }
        }else {
            for (int i=0;i<size;i++){
                if(element.equals(elements[i])){
                    return i;
                }
            }
        }

        return ELEMENT_NOT_FOUND;
    }

    @Override
    public String toString() {

        StringBuilder builder = new StringBuilder();
        builder.append("size=").append(size).append(",[");
        for(int i=0;i<size;i++){
            if(i!=0){
                builder.append(",");
            }
            builder.append(elements[i]);
        }
        builder.append("]");

        return builder.toString();
    }

    public static void main(String[] args) {
        ArrayList<String> stringArrayList = new ArrayList<String>();
        stringArrayList.add("xie");
        stringArrayList.add("wei");
        stringArrayList.add("cheng");
        stringArrayList.add("best");
        System.out.println(stringArrayList);
    }
}
