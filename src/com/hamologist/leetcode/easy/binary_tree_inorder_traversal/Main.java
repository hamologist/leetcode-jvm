package com.hamologist.leetcode.easy.binary_tree_inorder_traversal;

import com.hamologist.leetcode.shared.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        TreeNode treeNode = new TreeNode(
                1,
                null,
                new TreeNode(
                        2,
                        new TreeNode(3),
                        null
                )
        );
        System.out.println(solution.inorderTraversal(treeNode));
    }
}

class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        return Inner.solve(root);
    }

    private static class Inner {
        final ArrayList<Integer> result;

        Inner() {
            result = new ArrayList<>();
        }

        void traverse(TreeNode root) {
            if (root == null) {
                return;
            }

            traverse(root.left);
            result.add(root.val);
            traverse(root.right);
        }

        static List<Integer> solve(TreeNode root) {
            final Inner inner = new Inner();
            inner.traverse(root);

            return inner.result;
        }
    }
}
