package com.hamologist.leetcode.easy.delete_node_in_a_linked_list;

import com.hamologist.leetcode.shared.ListNode;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode exampleOne = new ListNode(4);
        exampleOne.next = new ListNode(5);
        exampleOne.next.next = new ListNode(1);
        exampleOne.next.next.next = new ListNode(9);
        solution.deleteNode(exampleOne.next);

        while (exampleOne != null) {
            System.out.println(exampleOne.val);
            exampleOne = exampleOne.next;
        }
    }
}

class Solution {
    public void deleteNode(ListNode node) {
        if (node == null) {
            return;
        }

        if (node.next == null) {
            node = null;
        }

        node.val = node.next.val;
        node.next = node.next.next;
    }
}