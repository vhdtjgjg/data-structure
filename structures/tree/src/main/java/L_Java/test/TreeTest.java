package L_Java.test;

import L_Java.LinkedBinaryTree;
import org.junit.Before;
import org.junit.Test;

public class TreeTest {
    /**
     * 构建二叉树,添加根节点r
     */
    LinkedBinaryTree<String> integerLinkedBinaryTree = new LinkedBinaryTree<>("r");

    @Before
    public void buildTree() {
        /*构建二叉树*/
        LinkedBinaryTree.BinaryTreeNode<String> r = integerLinkedBinaryTree.getRoot();
        //添加r根节点的左子结点a
        LinkedBinaryTree.BinaryTreeNode<String> a = integerLinkedBinaryTree.addChild(r, "a", true);
        //添加r根节点的右子结点b
        LinkedBinaryTree.BinaryTreeNode<String> b = integerLinkedBinaryTree.addChild(r, "b", false);
        //添加a节点的左子结点c
        LinkedBinaryTree.BinaryTreeNode<String> c = integerLinkedBinaryTree.addChild(a, "c", true);
        //添加a节点的右子结点d
        LinkedBinaryTree.BinaryTreeNode<String> d = integerLinkedBinaryTree.addChild(a, "d", false);
        //添加b节点的左子结点e
        LinkedBinaryTree.BinaryTreeNode<String> e = integerLinkedBinaryTree.addChild(b, "e", true);
        //添加b节点的右子结点f
        LinkedBinaryTree.BinaryTreeNode<String> f = integerLinkedBinaryTree.addChild(b, "f", false);
        //添加c节点的左子结点g
        LinkedBinaryTree.BinaryTreeNode<String> g = integerLinkedBinaryTree.addChild(c, "g", true);
        //添加c节点的右子结点h
        LinkedBinaryTree.BinaryTreeNode<String> h = integerLinkedBinaryTree.addChild(c, "h", false);
        //添加d节点的左子结点i
        LinkedBinaryTree.BinaryTreeNode<String> i = integerLinkedBinaryTree.addChild(d, "i", true);
        //添加f节点的左子结点j
        LinkedBinaryTree.BinaryTreeNode<String> j = integerLinkedBinaryTree.addChild(f, "j", true);
    }

    /**
     * 前序遍历测试
     */
    @Test
    public void test(){

        String s = integerLinkedBinaryTree.toPreorderTraversalString();
        System.out.println(s);

    }

    /**
     * 中序遍历测试
     */
    @Test
    public void test1(){

        String s = integerLinkedBinaryTree.toInorderTraversalString();
        System.out.println(s);

    }

    /**
     * 后序遍历测试
     */
    @Test
    public void test2(){

        String s = integerLinkedBinaryTree.postorderTraversalString();
        System.out.println(s);

    }

    /**
     * 层序遍历测试
     */
    @Test
    public void test3(){

        String s = integerLinkedBinaryTree.toLevelTraversalString();
        System.out.println(s);

    }


}
