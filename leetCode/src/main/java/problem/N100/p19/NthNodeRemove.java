package problem.N100.p19;

import common.ListNode;

import java.util.Deque;
import java.util.LinkedList;

public class NthNodeRemove {

    public ListNode removeNthFromEnd(ListNode head, int n) {

        int len = getLen(head);
        int remove = len - n + 1;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode p = dummy;
        while (p != null) {
            remove--;
            if (remove == 0) {
                ListNode next = p.next;
                p.next = next.next;
                break;
            }
            p = p.next;
        }
        return dummy.next;

    }

    public ListNode removeNthFromEndVForLoop(ListNode head, int n) {

        int len = getLen(head);
        int remove = len - n + 1;
        ListNode dummy = new ListNode(0, head);
        ListNode p = dummy;
        for (int i = 1; i < remove; i++) {
            p = p.next;
        }
        ListNode next = p.next;
        p.next = next.next;
        return dummy.next;

    }

    public ListNode removeNthFromEndVStack(ListNode head, int n) {
        ListNode dummy = new ListNode(0, head);
        ListNode p = dummy;
        Deque<ListNode> deque = new LinkedList<>();
        while (p != null) {
            deque.push(p);
            p = p.next;
        }
        for (int i = 0; i < n; i++) {
            deque.pop();
        }
        ListNode peek = deque.peek();
        peek.next = peek.next.next;
        return dummy.next;
    }
    public ListNode removeNthFromEndVDoublePoint(ListNode head, int n) {
        ListNode dummy = new ListNode(0, head);
        ListNode p1 = dummy;
        for (int i = 0; i < n+1; i++) {
            p1=p1.next;
        }
        ListNode p2=dummy;
        while (p1!=null){
            p1=p1.next;
            p2=p2.next;
        }
        p2.next=p2.next.next;
        return dummy.next;
    }

    private int getLen(ListNode head) {
        int len = 0;
        while (head != null) {
            len++;
            head = head.next;
        }
        return len;
    }

    public static void main(String[] args) {
        System.out.println();
    }

}
