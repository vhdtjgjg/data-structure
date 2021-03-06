package common;

import java.util.Optional;

public class ListNodeUtils {

    public static ListNode of(int... ints){

        ListNode listNode = new ListNode(ints);

        return listNode.next;
    }

    public static void show(ListNode listNode){
         Optional.ofNullable(listNode).ifPresent(ListNode::show);
        System.out.println();
    }

    public static int getLen(ListNode listNode){
        int len=0;
        while (listNode!=null){
            len++;
            listNode=listNode.next;
        }
        return len;
    }
}
