package linkedList.Double;

/**
 * https://blog.csdn.net/qq_42453117/article/details/98860344?utm_medium=distribute.pc_relevant.none-task-blog-baidulandingword-2&spm=1001.2101.3001.4242
 *
 * 双向链表类
 */
public class DoubleLinkedList {

    /**
     * 初始化一个头节点，不存放数据
     */
    private DoubleNode head=new DoubleNode(0,"","");

    /**
     * 添加节点到双向链表
     * @param node
     */
    public void add(DoubleNode node){

        // 当不考虑编号的顺序时:
        // 1、找到当前链表的最后节点
        // 2、将最后这个节点的next域指向新的节点即可

        // 因为head头节点不能动，因此我们需要一个辅助节点temp
        DoubleNode temp=head;

        //遍历链表找到尾节点
        while (true){

            if(temp.next==null){
                //找到尾节点
                break;
            }
            //后移
            temp=temp.next;

        }

        //循环结束后 ，temp指向的是尾节点
        //形成一个双向链表
        temp.next=node;
        node.pre=temp;
    }

    /**
     * 修改节点的信息，根据no编号来修改
     * @param newNode
     */
    public void update(DoubleNode newNode){

        //根据newNode的编号进行修改

        //判断链表是否为空
        if(isEmpty()){
            return;
        }

        DoubleNode oldNode = getNode(newNode.no);

        //根据flag判断是否已经找到要修改的节点
        if(oldNode!=null){
            oldNode.name=newNode.name;
            oldNode.nickname=newNode.nickname;
        }else {
            System.out.println("没有找到");
        }


    }

    /**
     * 从链表中删除一个节点
     * 自我删除
     * @param no
     */
    public void delete(int no){

        //判断当前链表是否为空
        if(isEmpty()){
            System.out.println("删除失败，空链表");
            return;
        }

        DoubleNode nodeDel = getNode(no);

        if(nodeDel!=null){

            nodeDel.pre.next=nodeDel.next;

            if(nodeDel.next!=null){
                nodeDel.next.pre=nodeDel.pre;
            }

        }else {
            System.out.println("删除失败，节点不存在");
        }
    }

    /**
     * 判断链表是否为空
     * @return
     */
    public boolean isEmpty(){
        if(head==null||head.next==null){
            System.out.println("链表为空");
            return true;
        }
        return false;

    }

    /**
     * 根据no找到节点
     */
    public DoubleNode getNode(int no){

        //定义辅助节点
        DoubleNode temp = head.next;



        while (true){
            if(temp==null){
                break;
            }

            if(temp.no==no){
                //找到需要修改的节点
                break;
            }

            temp=temp.next;
        }

        return temp;
    }

    /**
     * 遍历双向链表
     */
    public void list(){

        if(isEmpty()){
            return;
        }

        DoubleNode temp = head.next;

        while (true){
            //判断是否到达了链表末尾
            if(temp==null){
                break;
            }

            //输出节点信息
            System.out.println(temp);

            //将temp后移
            temp=temp.next;
        }
    }

    public static void main(String[] args) {

        DoubleNode doubleNode1 = new DoubleNode(1, "浅井", "惠");
        DoubleNode doubleNode2 = new DoubleNode(2, "相麻", "瑾");
        DoubleNode doubleNode3 = new DoubleNode(3, "春琦", "美空");
        DoubleNode doubleNode4 = new DoubleNode(4, "野之尾", "盛夏");

        DoubleLinkedList doubleLinkedList = new DoubleLinkedList();
        doubleLinkedList.add(doubleNode1);
        doubleLinkedList.add(doubleNode2);
        doubleLinkedList.add(doubleNode3);
        doubleLinkedList.add(doubleNode4);

        doubleLinkedList.list();

        //doubleLinkedList.delete(2);
        System.out.println("************************************");

        DoubleNode doubleNode5 = new DoubleNode(5, "宇川", "纱纱音");

        doubleLinkedList.update(doubleNode5);
        doubleLinkedList.list();

    }
}
