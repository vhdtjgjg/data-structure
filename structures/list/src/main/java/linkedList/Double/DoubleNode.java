package linkedList.Double;

/**
 * 节点类
 */
public class DoubleNode {

    public int no;

    public String name;

    public String nickname;

    /**
     * 指向下一个节点
     */
    public DoubleNode next;

    /**
     * 指向前一个节点
     */
    public DoubleNode pre;

    public DoubleNode(int no, String name, String nickname) {
        this.no = no;
        this.name = name;
        this.nickname = nickname;
    }

    @Override
    public String toString() {
        return "TwoWayNode{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", nickname='" + nickname + '\'' +
                '}';
    }
}
