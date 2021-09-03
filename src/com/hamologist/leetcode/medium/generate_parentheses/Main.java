package com.hamologist.leetcode.medium.generate_parentheses;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.generateParenthesis(3));
    }
}

class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        solve(result, "", n, n);

        return result;
    }

    private void solve(List<String> result, String current, int left, int right) {
        if (left == 0 && right == 0) {
            result.add(current);
            return;
        }

        if (left < right) {
            solve(result, current + ')', left, right - 1);
        }

        if (left > 0) {
            solve(result, current + '(', left - 1, right);
        }
    }
}
