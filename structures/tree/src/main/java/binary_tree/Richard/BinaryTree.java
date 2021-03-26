package binary_tree.Richard;

/**
 * 树结构
 */
public class BinaryTree {

    private Node root;

    /**
     * 插入Node
     * 插入之前需要判断是否为null
     * 为null需要比较大小直到currentNode为null就插入
     * @param iData
     * @param dData
     */
    public void insert(int iData,double dData){

        Node newNode = new Node();
        newNode.iData=iData;
        newNode.dData=dData;

        //判断root node 是否为null
        if(root==null){
            root=newNode;
        }else {
            Node currentNode=root;

            Node parent;

            while (true){

                //保存当current变为null之前的那一个父节点
                parent=currentNode;

                //插入左节点
                if(iData<currentNode.iData){

                    //不断向左node寻找 是否为null
                    currentNode=currentNode.leftNode;

                    if(currentNode==null){
                        parent.leftNode=newNode;
                        return;
                    }
                }else {
                    currentNode=currentNode.rightNode;

                    if(currentNode==null){
                        parent.rightNode=newNode;
                        return;
                    }
                }
            }
        }
    }

    /**
     * 在tree中寻找关键字
     * @param key
     * @return 返回一个Node
     */
    public Node find(int key){

        Node currentNode=root;

        while (currentNode.iData!=key){

            if(currentNode.iData>key){
                currentNode=currentNode.leftNode;
            }else {
                currentNode=currentNode.rightNode;
            }

            if(currentNode==null){
                return null;
            }
        }

        return currentNode;
    }

    /**
     * 查找树中的最大值和最小值
     * @return
     */
    public Node[] mVal(){

        Node minNode=null;
        Node maxNode=null;
        Node[] maxAndMinVal = new Node[2];

        //从树的顶部开始搜索
        Node currentNode=root;

        while (currentNode!=null){
            minNode=currentNode;
            currentNode=currentNode.leftNode;
        }
        maxAndMinVal[0]=minNode;

        currentNode=root;
        while (currentNode!=null){
            maxNode=currentNode;
            currentNode=currentNode.rightNode;
        }
        maxAndMinVal[1]=maxNode;

        return maxAndMinVal;
    }

    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.insert(1, 2.4);
        binaryTree.insert(2, 4.4);
        binaryTree.insert(3, 7.2);
        binaryTree.insert(4, 4.9);
        binaryTree.insert(5, 6.1);
        binaryTree.insert(6, 9.3);

        Node node = binaryTree.find(3);

        if(node!=null){
            System.out.println(node.showNode());
        }

        Node[] nodes = binaryTree.mVal();
        System.out.println(binaryTree.root.showNode());
        System.out.println(nodes[0].showNode());
        System.out.println(nodes[1].showNode());
        System.out.println(binaryTree.root.showNode());

    }
}
