package L_Java;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

/**
 * 二叉树的链式存储结构的简单实现
 * @param <E>
 */
public class LinkedBinaryTree<E>{

    ThreadLocal<StringBuilder> threadLocal = ThreadLocal.withInitial(StringBuilder::new);


    /**
     * 外部保存根节点的引用
     */
    private BinaryTreeNode<E> root;

    /**
     * 树节点的数量
     */
    private int size;

    /**
     * 空构造器
     */
    public LinkedBinaryTree() {
    }

    /**
     * 构造器，初始化root节点
     * @param root
     */
    public LinkedBinaryTree(E root) {

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
     * 先序遍历，提供给外部使用的api
     * @return 遍历的数据
     */
    public String toPreorderTraversalString(){

        //如果是空树，直接返回空
        if(isEmpty()){
            return null;
        }
        
        //从根节点开始递归
        preorderTraversal(root);

        //获取遍历结果
        String s = threadLocal.get().toString();
        threadLocal.remove();
        return s;

    }

    /**
     * 先序遍历，内部使用的递归遍历方法
     * @param root 节点，从根节点开始
     */
    private void preorderTraversal(BinaryTreeNode<E> root) {

        //添加树节点
        threadLocal.get().append(root).append("->");

        //获取节点的左子节点
        BinaryTreeNode<E> left = getLeft(root);
        if(left!=null){
            //如果左子节点不为null，则继续递归遍历该左子节点
            preorderTraversal(left);
        }

        //获取节点的右子节点
        BinaryTreeNode<E> right = getRight(root);
        if(right!=null){
            //如果左子节点不为null，则继续递归遍历该左子节点
            preorderTraversal(right);
        }

    }

    /**
     * 中序遍历，提供给外部使用的api
     * @return 遍历的数据
     */
    public String toInorderTraversalString(){

        //如果是空树，直接返回空
        if(isEmpty()){
            return null;
        }

        //从根节点开始递归
        inorderTraversal(root);

        //获取遍历结果
        String s = threadLocal.get().toString();
        threadLocal.remove();
        return s;

    }

    /**
     * 中序遍历，内部使用的递归遍历方法
     * @param root 节点，从根节点开始
     */
    private void inorderTraversal(BinaryTreeNode<E> root) {

        BinaryTreeNode<E> left = getLeft(root);

        if(left!=null){
            //如果左子节点不为null,则继续递归遍历该左子节点
            inorderTraversal(left);
        }

        //添加数据节点
        threadLocal.get().append(root).append("->");

        //获取数据节点的右子节点
        BinaryTreeNode<E> right = getRight(root);
        if(right!=null){
            //如果右子节点不为null,则继续递归遍历该右子节点
            inorderTraversal(right);
        }

    }

    /**
     * 后序遍历，提供给外部使用的api
     * @return 遍历的数据
     */
    public String postorderTraversalString(){

        //如果是空树，直接返回空
        if(isEmpty()){
            return null;
        }

        //从根节点开始递归
        postorderTraversal(root);

        //获取遍历结果
        String s = threadLocal.get().toString();
        threadLocal.remove();
        return s;

    }

    /**
     * 后序遍历，内部使用的递归遍历方法
     * @param root 节点，从根节点开始
     */
    private void postorderTraversal(BinaryTreeNode<E> root) {

        BinaryTreeNode<E> left = getLeft(root);

        if(left!=null){
            //如果左子节点不为null,则继续递归遍历该左子节点
            inorderTraversal(left);
        }

        //获取数据节点的右子节点
        BinaryTreeNode<E> right = getRight(root);
        if(right!=null){
            //如果右子节点不为null,则继续递归遍历该右子节点
            inorderTraversal(right);
        }

        //添加数据节点
        threadLocal.get().append(root).append("->");

    }

    /**
     * 层序遍历，提供给外部使用的api
     * @return 遍历的数据
     */
    public String toLevelTraversalString(){

        //如果是空树，直接返回空
        if(isEmpty()){
            return null;
        }

        //从根节点开始遍历，借用队列
        levelTraversal(root);

        //获取遍历结果
        String s = threadLocal.get().toString();
        threadLocal.remove();
        return s;

    }

    /**
     * 层序遍历，内部使用的借用了队列
     * @param root 节点，从根节点开始
     */
    private void levelTraversal(BinaryTreeNode<E> root) {

        Queue<BinaryTreeNode<E>> binaryTreeNodeQueue = new LinkedList<>();
        binaryTreeNodeQueue.add(root);

        while (!binaryTreeNodeQueue.isEmpty()){
            BinaryTreeNode<E> nowNode = binaryTreeNodeQueue.poll();
            //添加数据节点
            threadLocal.get().append(nowNode.data).append("->");
            if(nowNode.left!=null){
                //如果左子节点不为null,则将子节点加入队列
                binaryTreeNodeQueue.add(nowNode.left);
            }

            if(nowNode.right!=null){
                //如果左子节点不为null,则将子节点加入队列
                binaryTreeNodeQueue.add(nowNode.right);
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
         * 左子节点
         */
        BinaryTreeNode<E> left;

        /**
         * 左子节点
         */
        BinaryTreeNode<E> right;

        public BinaryTreeNode(E data) {
            this.data = data;
        }

        public BinaryTreeNode(E data, BinaryTreeNode<E> left, BinaryTreeNode<E> right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }

        @Override
        public String toString() {
            return data.toString();
        }
    }
}
