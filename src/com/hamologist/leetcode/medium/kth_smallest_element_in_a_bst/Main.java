package com.hamologist.leetcode.medium.kth_smallest_element_in_a_bst;

import com.hamologist.leetcode.shared.TreeNode;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.kthSmallest(new TreeNode(
                3,
                new TreeNode(
                        1,
                        null,
                        new TreeNode(2)
                ),
                new TreeNode(4)
        ), 1));
    }
}

class Solution {
    public int kthSmallest(TreeNode root, int k) {
        return Inner.solve(root, k);
    }

    private static class Inner {
        int count;
        int k;
        int ans;

        Inner(int k) {
            count = 0;
            this.k = k;
            ans = 0;
        }

        void kthSmallest(TreeNode root) {
            if (root == null) {
                return;
            }

            kthSmallest(root.left);
            if (count < k) {
                count += 1;
                ans = root.val;
            }
            kthSmallest(root.right);
        }

        static int solve(TreeNode root, int k) {
            Inner inner = new Inner(k);
            inner.kthSmallest(root);

            return inner.ans;
        }
    }
}
