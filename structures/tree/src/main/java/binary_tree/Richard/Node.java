package binary_tree.Richard;

/**
 * 树节点
 */
public class Node {

    public int iData;

    public double dData;

    public Node leftNode;

    public Node rightNode;

    public String showNode() {
        return "{" +
                "iData=" + iData +
                ", dData=" + dData +
                '}';
    }
}
