package com.hamologist.leetcode.medium.subsets;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.subsets(new int[] {1, 2, 3}));
    }
}

class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());
        solve(result, new ArrayList<>(), Arrays.stream(nums).boxed().collect(Collectors.toList()));

        return result;
    }

    private void solve(List<List<Integer>> result, List<Integer> current, List<Integer> remaining) {
        while (!remaining.isEmpty()) {
            Integer num = remaining.remove(0);
            List<Integer> next = new ArrayList<>(current);
            next.add(num);
            result.add(next);

            solve(result, next, new ArrayList<>(remaining));
        }
    }
}
