package com.hamologist.leetcode.medium.permutations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        List<List<Integer>> result = solution.permute(new int[] {1, 2, 3});
        System.out.println(result);
    }
}

class Solution {
    public List<List<Integer>> permute(int[] nums) {
        new Inner();
        return Inner.solve(nums);
    }

    static private class Inner {
        final List<List<Integer>> result;

        Inner() {
            result = new ArrayList<>();
        }

        void permute(List<Integer> current, List<Integer> nums) {
            if (nums.isEmpty()) {
                result.add(current);
                return;
            }

            int index = 0;
            for (int num : nums) {
                ArrayList<Integer> nextCurrent = new ArrayList<>(current);
                ArrayList<Integer> nextNums = new ArrayList<>(nums);
                nextCurrent.add(num);
                nextNums.remove(index);
                permute(nextCurrent, nextNums);
                index++;
            }
        }

        static List<List<Integer>> solve(int[] nums) {
            final Inner inner = new Inner();
            inner.permute(new ArrayList<>(), Arrays.stream(nums).boxed().collect(Collectors.toList()));

            return inner.result;
        }
    }
}