package problem.N300.P206_reverse_linked_list;

import common.ListNode;
import org.junit.Test;

public class Solution {

    public ListNode reverseList(ListNode head) {

        ListNode preNode=null;
        ListNode curNode=head;

        while (curNode!=null){
            ListNode tempNode=curNode.next;
            curNode.next=preNode;
            preNode=curNode;
            curNode=tempNode;
        }

        return preNode;
    }

    @Test
    public void test(){

         ListNode listNode1 = new  ListNode(1);
         ListNode listNode2 = new  ListNode(2,listNode1);
         ListNode listNode3 = new  ListNode(3,listNode2);
//        ListNode listNode4 = new ListNode(4,listNode3);
//        ListNode listNode5 = new ListNode(5,listNode4);


         ListNode listNode = reverseList(listNode3);


    }
}
