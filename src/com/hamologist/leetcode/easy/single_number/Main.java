package com.hamologist.leetcode.easy.single_number;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.singleNumber(new int[] {2, 2, 1}));
    }
}

class Solution {
    public int singleNumber(int[] nums) {
        HashSet<Integer> lookup = new HashSet<Integer>();

        for (int num : nums) {
            if (lookup.contains(num)) {
                lookup.remove(num);
            } else {
                lookup.add(num);
            }
        }

        return lookup.iterator().next();
    }
}
