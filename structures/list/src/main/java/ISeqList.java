/**
 * ˳������ӿ�
 */
public interface ISeqList<T> {

    /**
     * �ж������Ƿ�Ϊ��
     * @return
     */
    boolean isEmpty();

    /**
     * ������
     * @return
     */
    int length();

    /**
     * ��ȡԪ��
     * @param index
     * @return
     */
    T get(int index);

    /**
     * ����index���Ԫ��
     * @param index
     * @param data
     * @return
     */
    boolean add(int index,T data);

    /**
     * ���Ԫ��
     * @param data
     * @return
     */
    boolean add(T data);

    /**
     * ����
     * @param index
     * @return
     */
    boolean remove(int index);

    /**
     * ����data�Ƴ�Ԫ��
     * @param data
     * @return
     */
    boolean remove(T data);
}
