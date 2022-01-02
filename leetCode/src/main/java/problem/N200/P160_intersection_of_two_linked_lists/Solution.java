package problem.N200.P160_intersection_of_two_linked_lists;

import java.util.HashSet;
import java.util.Set;

public class Solution {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        ListNode curA=headA;
        ListNode curB=headB;

        Set<ListNode> listNodeSet = new HashSet<ListNode>();

        while (curA != null || curB != null) {

            if(curA!=null){

                if(!listNodeSet.add(curA)){
                    return curA;
                }

                curA=curA.next;
            }

            if(curB!=null){

                if(!listNodeSet.add(curB)){
                    return curB;
                }

                curB=curB.next;
            }

        }

        return null;
    }

    public ListNode getIntersectionNodeDemo(ListNode headA, ListNode headB) {

        ListNode curA=headA;
        ListNode curB=headB;

        while (curA!=curB){
            curA = curA==null? headB:curA.next;
            curB = curB==null? headA:curB.next;
        }

        return curA;
    }

}
