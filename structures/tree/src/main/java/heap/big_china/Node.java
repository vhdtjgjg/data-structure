package heap.big_china;

public class Node {

    private int iData;

    public Node(int key) {
        this.iData = key;
    }

    public int getKey(){
        return iData;
    }

    public void setKey(int key){
        this.iData=key;
    }

}
