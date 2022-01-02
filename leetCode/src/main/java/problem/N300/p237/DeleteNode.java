package problem.N300.p237;

import common.ListNode;

public class DeleteNode {
    public void deleteNode(ListNode node) {

        node.val=node.next.val;
        node.next=node.next.next;

    }

}
