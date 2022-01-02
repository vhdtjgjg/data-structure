package problem.N300.P234;

import common.ListNode;
import common.ListNodeUtils;

import java.util.ArrayList;
import java.util.List;

public class Palindrome {
    public boolean isPalindrome(ListNode head) {

        List<Integer> listNodes = new ArrayList<>();
        while (head != null) {
            listNodes.add(head.val);
            head = head.next;
        }

        int front = 0;
        int rear = listNodes.size() - 1;

        while (front < rear) {
            if (listNodes.get(front) != listNodes.get(rear)) {
                return false;
            }
            front++;
            rear--;
        }
        return true;
    }

    public static void main(String[] args) {
        ListNode head = ListNodeUtils.of(1, 2, 2,1);
        Palindrome palindrome = new Palindrome();
        System.out.println(palindrome.isPalindrome(head));
    }
}
