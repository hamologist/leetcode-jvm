package com.hamologist.leetcode.easy.maximum_depth_of_binary_tree;

import com.hamologist.leetcode.shared.TreeNode;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        TreeNode exampleOne = new TreeNode(
                3,
                new TreeNode(9),
                new TreeNode(
                        20,
                        new TreeNode(15),
                        new TreeNode(7)
                )
        );
        System.out.println(solution.maxDepth(exampleOne));

        TreeNode exampleTwo = new TreeNode(
                1,
                null,
                new TreeNode(2)
        );
        System.out.println(solution.maxDepth(exampleTwo));

        System.out.println(solution.maxDepth(null));

        TreeNode exampleFour = new TreeNode(0);
        System.out.println(solution.maxDepth(exampleFour));
    }
}

class Solution {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        return Math.max(innerMaxDepth(root.left, 1), innerMaxDepth(root.right, 1));
    }

    int innerMaxDepth(TreeNode root, int depth) {
        if (root == null) {
            return depth;
        }

        return Math.max(innerMaxDepth(root.left, depth + 1), innerMaxDepth(root.right, depth + 1));
    }
}
