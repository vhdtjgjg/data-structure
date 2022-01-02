package problem.N100.P21;

import common.ListNode;

public class TwoListsMerge {

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        if(l1==null){
            return l2;
        }

        if(l2==null){
            return l1;
        }

        ListNode preHead = new ListNode(-1);

        ListNode pre=preHead;

        while (l1!=null&&l2!=null){

            System.out.println("***************");

            if(l1.val<l2.val){
                pre.next=l1;
                l1=l1.next;
            }else {
                pre.next=l2;
                l2=l2.next;
            }

            pre=pre.next;

        }

        pre.next=l1==null?l2:l1;

        return preHead.next;
    }

    public static ListNode mergeTwoListsV2(ListNode l1, ListNode l2){
        ListNode resultListNode = new ListNode();
        ListNode tempListNode1=l1;
        ListNode tempListNode2=l2;
        while (tempListNode1!=null&&tempListNode2!=null){
            if(tempListNode1.val< tempListNode2.val){
                add(resultListNode,tempListNode1.val);
                tempListNode1=tempListNode1.next;
            }else {
                add(resultListNode,tempListNode2.val);
                tempListNode2=tempListNode2.next;
            }
        }
        while (tempListNode1!=null){
            add(resultListNode,tempListNode1.val);
            tempListNode1=tempListNode1.next;
        }
        while (tempListNode2!=null){
            add(resultListNode,tempListNode2.val);
            tempListNode2=tempListNode2.next;
        }
        return resultListNode.next;
    }
    public static ListNode mergeTwoListsV3Recursion(ListNode l1, ListNode l2){

        if(l1==null){
            return l2;
        }
        if(l2==null){
            return l1;
        }
        if(l1.val< l2.val){
            l1.next=mergeTwoListsV3Recursion(l1.next,l2);
            return l1;
        }else {
            l2.next=mergeTwoListsV3Recursion(l1,l2.next);
            return l2;
        }
    }
    public static ListNode mergeTwoListsV4Iteration(ListNode l1, ListNode l2){

        ListNode preHead=new ListNode();
        ListNode pre=preHead;

        while (l1!=null&&l2!=null){
            if(l1.val< l2.val){
                pre.next=l1;
                l1=l1.next;
            }else {
                pre.next=l2;
                l2=l2.next;
            }
            pre=pre.next;
        }
        pre.next=l1==null?l2:l1;
        return preHead.next;
    }

    private static void add(ListNode resultListNode, int newVal) {
        ListNode listNode = new ListNode(newVal);
        ListNode tempNode = resultListNode.next;

        while (tempNode!=null){

            if(tempNode.next==null){
                break;
            }
            tempNode=tempNode.next;
        }

        if(tempNode==null){
            resultListNode.next=listNode;
        }else {
            tempNode.next=listNode;
        }
    }

}
