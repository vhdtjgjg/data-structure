package problem.NO21;

public class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    /*自制的方法*/

    public void list(){

        System.out.print(val+" ");

        ListNode currentListNode = next;

        while (currentListNode !=null){
            System.out.print(currentListNode.val+" ");
            currentListNode=currentListNode.next;
        }

        System.out.println();

    }

    public void add(int newVal){

        ListNode listNode = new ListNode(newVal);

        add(listNode);
    }

    public void add(ListNode newListNode){

        ListNode tempNode = this.next;

        while (tempNode!=null){

            if(tempNode.next==null){
                break;
            }
            tempNode=tempNode.next;
        }

        if(tempNode==null){
            this.next=newListNode;
        }else {
            tempNode.next=newListNode;

        }



    }
}
