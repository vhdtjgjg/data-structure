package common;

import java.util.Objects;
import java.util.Optional;

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

     ListNode(int... ints){

        for (int anInt : ints) {
            add(anInt);
        }
    }

    @Override
    public String toString() {
        return val+show(next);
    }

    private String show(ListNode next) {
        return Optional.ofNullable(next).map(n->","+n.toString()).orElse(";");
    }

    /*自制的方法*/

     void show(){

        System.out.print(val+" ");

        ListNode currentListNode = next;

        while (currentListNode !=null){
            System.out.print(currentListNode.val+" ");
            currentListNode=currentListNode.next;
        }
    }

     private ListNode add(int newVal){

        ListNode listNode = new ListNode(newVal);

        return add(listNode);
    }

     private ListNode add(ListNode newListNode){

        ListNode tempNode = this.next;

        while (tempNode!=null){

            if(tempNode.next==null){
                break;
            }
            tempNode=tempNode.next;
        }

        if(tempNode==null){
            this.next=newListNode;
        }else {
            tempNode.next=newListNode;
        }
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ListNode listNode = (ListNode) o;
        return val == listNode.val && Objects.equals(next, listNode.next);
    }

    @Override
    public int hashCode() {
        return Objects.hash(val, next);
    }
}
