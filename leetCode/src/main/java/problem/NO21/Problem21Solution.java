package problem.NO21;

public class Problem21Solution {

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        } else if (l2 == null) {
            return l1;
        } else if (l1.val < l2.val) {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }

    }

    public static void main(String[] args) {

        ListNode listNode1 = new ListNode(1);
        listNode1.add(3);
        listNode1.add(4);

        listNode1.list();

        ListNode listNode2 = new ListNode(2);
        listNode2.add(5);
        listNode2.add(6);

        listNode2.list();

        ListNode mergeTwoLists = mergeTwoLists(listNode1, listNode2);
        mergeTwoLists.list();

    }

}
