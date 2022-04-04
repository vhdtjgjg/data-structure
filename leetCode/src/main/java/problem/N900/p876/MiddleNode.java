package problem.N900.p876;

import common.ListNode;
import common.ListNodeUtils;

public class MiddleNode {

    public ListNode middleNode(ListNode head) {
        ListNode dummy = new ListNode(0, head);
        int len = ListNodeUtils.getLen(head);
        int middle = len / 2+1;
        for (int j = 0; j < middle; j++) {
            dummy=dummy.next;
        }
        return dummy;
    }
}
