package com.hamologist.leetcode.easy.reverse_linked_list;

import com.hamologist.leetcode.shared.ListNode;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode exampleOne = new ListNode(1);
        exampleOne.next = new ListNode(2);
        exampleOne.next.next = new ListNode(3);
        exampleOne.next.next.next = new ListNode(4);
        exampleOne.next.next.next.next = new ListNode(5);
        ListNode reversed = solution.reverseList(exampleOne);

        while (reversed!= null) {
            System.out.println(reversed.val);
            reversed = reversed.next;
        }
    }
}

class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }

        ListNode prev = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }

        return prev;
    }
}
