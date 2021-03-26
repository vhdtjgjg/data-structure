package heap.big_china;

public class Heap {

    private Node[] heapArray;
    private int maxSize;
    private int currentSize;

    public Heap(Node[] heapArray) {
        this.heapArray = heapArray;
        currentSize=0;
        heapArray=new Node[maxSize];
    }

    public boolean isEmpty(){
        return currentSize==0;
    }

    public boolean isFull(){
        return currentSize==maxSize;
    }

    public boolean insert(int key){

        if(isFull()){
            return false;
        }

        Node newNode = new Node(key);

        heapArray[currentSize]=newNode;

        return true;

    }

    /**
     * 向上调整
     * @param index
     */
    public void trickleUp(int index){

        int parent = (index - 1) / 2;   //父节点的索引
        Node bottom = heapArray[index];   //将新加的节点

        while (index>0 && heapArray[parent].getKey()<bottom.getKey()){
            heapArray[index]=heapArray[parent];
            index=parent;
            parent=(parent-1)/2;
        }
        heapArray[index]=bottom;


    }
}
