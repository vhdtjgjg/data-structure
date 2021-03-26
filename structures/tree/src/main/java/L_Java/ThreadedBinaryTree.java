package L_Java;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

/**
 * https://blog.csdn.net/weixin_43767015/article/details/105755132
 */

/**
 * 线索二叉树的简单实现
 * @param <E>
 */
public class ThreadedBinaryTree<E>{

    ThreadLocal<StringBuilder> threadLocal = ThreadLocal.withInitial(StringBuilder::new);


    /**
     * 外部保存根节点的引用
     */
    private BinaryTreeNode<E> root;

    /**
     * 线索化的时候保存刚刚访问过的前驱节点
     */
    private BinaryTreeNode<E> pre;

    /**
     * 树节点的数量
     */
    private int size;

    /**
     * 空构造器
     */
    public ThreadedBinaryTree() {
    }

    /**
     * 构造器，初始化root节点
     * @param root
     */
    public ThreadedBinaryTree(E root) {

        checkNullData(root);
        this.root = new BinaryTreeNode<E>(root);
        size++;
    }

    /**
     * 添加子节点
     * @param parent 父节点的引用
     * @param data 节点数据
     * @param left 是否是左子节点
     * @return
     */
    public BinaryTreeNode<E> addChild(BinaryTreeNode<E> parent,E data, boolean left){

        checkNullParent(parent);
        checkNullData(data);

        BinaryTreeNode<E> node = new BinaryTreeNode<E>(data);

        if(left){
            if(parent.left!=null){
                throw new IllegalStateException("该父节点已经存在左子节点，添加失败");
            }
            parent.left=node;
        }else {
            if(parent.right!=null){
                throw new IllegalStateException("该父节点已经存在右子节点，添加失败");
            }
            parent.right=node;
        }

        size++;

        return node;
    }

    /**
     * 是否为空树
     * @return
     */
    public boolean isEmpty(){

        return size==0;
    }

    /**
     * 返回节点数
     * @return 节点数
     */
    public int size(){

        return size;
    }

    /**
     * 获取根节点
     * @return 根节点，或者null--表示空树
     */
    public BinaryTreeNode<E> getRoot(){

        return root;
    }

    /**
     * 获取左子节点
     * @param parent 父节点的引用
     * @return 左子节点或者null--表示没有左子节点
     */
    public BinaryTreeNode<E> getLeft(BinaryTreeNode<E> parent){

        return parent==null?null:parent.left;
    }

    /**
     * 获取右子节点
     * @param parent 父节点的引用
     * @return 右子节点或者null--表示没有右子节点
     */
    public BinaryTreeNode<E> getRight(BinaryTreeNode<E> parent){

        return parent==null?null:parent.right;
    }

    /**
     * 将以root为根节点的二叉树线索化 中序法
     * @return 线索化是否成功
     */
    public boolean inThread(){

        if(isEmpty()){
            return false;
        }

        inThread(getRoot());

        return true;
    }

    /**
     * 将以root为根节点的二叉树线索化 中序法
     * @param root 节点，从根节点开始
     */
    private void inThread(BinaryTreeNode<E> root) {

        BinaryTreeNode<E> left = getLeft(root);

        if(left!=null){
            //如果左子节点不为null，则继续递归遍历该左子节点
            inThread(left);
        }else { //相比于中序遍历，中间多了如下步骤

            //如果左子节点为null，因为前驱节点刚刚访问过，将左子节点设置为线索
            root.lTag=true;
            root.left=pre;
        }

        //如果前驱节点没有右子节点，那就把前节点当作前驱节点的后继节点
        if(pre!=null && null==pre.right){
            pre.rTag=true;
            pre.right=root;
        }

        //每次将当前节点设置为pre，下个节点就把该节点当成前驱节点
        pre=root;

        BinaryTreeNode<E> right = getRight(root);

        if(right!=null){
            //如果右子节点不为null,则继续递归遍历该右子节点
            inThread(right);
        }


    }

    /**
     * 中序遍历线索二叉树
     * @param root
     */
    public void inThreadList(BinaryTreeNode<E> root){

        if(root==null){
            return;
        }

        //查找中序遍历的起始节点
        while (root!=null&&!root.lTag){
            root=root.left;
        }

        while (root!=null){
            System.out.println(root.data+",");

            //如果右子节点是线索
            if(root.rTag){
                root=root.right;
            }else {
                //有右子节点，遍历右子节点
                root=root.right;
                //如果右子节点不为null，并且右子节点的左子节点存在
                while (root!=null&&!root.lTag){
                    root=root.left;
                }
            }
        }

    }

    /**
     * 检查父节点是否为null
     * @param parent
     */
    private void checkNullParent(BinaryTreeNode<E> parent) {

        if(parent==null){
            throw new NoSuchElementException("父节点不能为null");
        }
    }

    /**
     * 数据判null
     * @param data 添加的数据
     */
    private void checkNullData(E data) {

        if(data==null){
            throw new NullPointerException("数据不允许为null");
        }

    }

    /**
     * 内部节点对象
     * @param <E>
     */
    public static class BinaryTreeNode<E> {

        /**
         * 数据域
         */
        E data;

        /**
         * 左子节点/前驱
         */
        BinaryTreeNode<E> left;

        /**
         * 右子节点/后驱
         */
        BinaryTreeNode<E> right;

        /**
         * false：指向左子节点、true：前驱线索
         */
        boolean lTag;

        /**
         * false：指向右子节点、true：后继线索
         */
        boolean rTag;

        public BinaryTreeNode(E data) {
            this.data = data;
        }

        @Override
        public String toString() {
            return data.toString();
        }
    }
}
