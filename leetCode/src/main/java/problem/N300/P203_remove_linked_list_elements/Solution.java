package problem.N300.P203_remove_linked_list_elements;

import org.junit.Test;

public class Solution {



    public ListNode removeElements(ListNode head, int val) {

        if(head==null){
            return null;
        }

        ListNode cur=head;

        while (cur.next!=null){

            if(cur.val==val){
                cur=cur.next;
            }

            if(cur!=null){
                if(cur.next.val==val){
                    cur.next=cur.next.next;
                }
            }

            cur=cur.next;

        }


        if(head.val==val){
            head=head.next;
        }


        return head;
    }

    public ListNode removeElementsDemo(ListNode head, int val) {

        ListNode startNode=new ListNode(0);
        startNode.next=head;
        ListNode cur=startNode;

        while (cur.next!=null){

            if(cur.next.val==val){
                cur.next=cur.next.next;
            }else {
                cur=cur.next;
            }
        }

        return startNode.next;
    }

    @Test
    public void test(){

        ListNode listNode1 = new ListNode(3);
        ListNode listNode2 = new ListNode(3,listNode1);
        ListNode listNode3 = new ListNode(3,listNode2);
//        ListNode listNode4 = new ListNode(4,listNode3);
//        ListNode listNode5 = new ListNode(5,listNode4);

        System.out.println(listNode3.printNode());
        ListNode listNode = removeElements(listNode3, 3);
        System.out.println(listNode.printNode());

    }
}
