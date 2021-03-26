package problem.NO21;

public class Problem21 {

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
