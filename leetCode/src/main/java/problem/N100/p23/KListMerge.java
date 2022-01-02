package problem.N100.p23;

import common.ListNode;
import problem.N100.P21.TwoListsMerge;

import java.util.Comparator;
import java.util.PriorityQueue;

public class KListMerge {

    public ListNode mergeKLists(ListNode[] lists) {

        ListNode listNode = null;
        for (ListNode list : lists) {
            listNode = TwoListsMerge.mergeTwoLists(listNode, list);
        }
        return listNode;
    }

    public ListNode mergeKListsV2DivideAndConquer(ListNode[] lists) {
        int length = lists.length;
        return merge(lists, 0, length - 1);
    }

    public ListNode mergeKListsV3PriorityQueue(ListNode[] lists) {
        PriorityQueue<ListNode> listNodes = new PriorityQueue<>();
        int length = lists.length;
        return merge(lists, 0, length - 1);
    }

    class ListNodeQueueValue implements Comparator<ListNode>{

        @Override
        public int compare(ListNode o1, ListNode o2) {
            return o1.val-o2.val;
        }
    }

    private ListNode merge(ListNode[] lists, int left, int right) {
        if (left == right) {
            return lists[left];
        }
        if (left > right) {
            return null;
        }
        int mid = left + right >> 1;
        return TwoListsMerge.mergeTwoListsV4Iteration(merge(lists, left, mid), merge(lists, mid + 1, right));
    }
}
