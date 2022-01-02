package problem.N200.P141_linked_list_cycle;

import common.ListNode;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    private final static ArrayList<ListNode> LIST=new ArrayList<>();

//    public boolean hasCycle(ListNode head) {
//
//        List<ListNode> listNodes = new ArrayList<ListNode>();
//
//        while (head!=null){
//            boolean contains = listNodes.contains(head);
//            if(contains){
//                return true;
//            }
//            listNodes.add(head);
//            head=head.next;
//        }
//        return false;
//    }

    public boolean hasCycleV2(ListNode head) {

        while (head!=null){
            if(LIST.contains(head)){
                return true;
            }
            LIST.add(head);
            head=head.next;
        }
        return false;
    }
    public boolean hasCycleV3(ListNode head) {
        if(head==null||head.next==null){
            return false;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        while (slow!=fast){
            if(fast==null||fast.next==null){
                return false;
            }
            slow=slow.next;
            fast=fast.next.next;
        }
        return true;
    }
}
