package base_tree.SelfControl;

public interface Tree {

    /**
     * 返回当前节点中存放的对象
     * @return
     */
    Object getElem();

    /**
     * 将对象object存入当前节点，并返回此前的内容
     * @param object
     * @return
     */
    Object setElem(Object object);

    /**
     * 返回当前节点的父节点
     * @return
     */
    Tree getParent();
}
