package problem.N300.P206_reverse_linked_list;

public class ListNode {
    int val;
    ListNode next;

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    ListNode(int x) {
        val = x;
        next = null;
    }

    @Override
    public String toString() {
        return  val +" -> ";
    }

    public String printNode(){

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(toString());
        ListNode cur=next;
        while (cur!=null){
            stringBuilder.append(cur.toString());
            cur=cur.next;
        }


        return stringBuilder.substring(0,stringBuilder.length()-4);
    }
}