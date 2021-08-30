package com.hamologist.leetcode.easy.reverse_string;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        char[] exampleOne = "hello".toCharArray();
        solution.reverseString(exampleOne);
        System.out.println(exampleOne);

        char[] exampleTwo = "Hannah".toCharArray();
        solution.reverseString(exampleTwo);
        System.out.println(exampleTwo);
    }
}

class Solution {
    public void reverseString(char[] s) {
        int length = s.length;
        for (int i = 0; i < length / 2; i++) {
            char temp = s[i];
            s[i] = s[length - (i + 1)];
            s[length - (i + 1)] = temp;
        }
    }
}