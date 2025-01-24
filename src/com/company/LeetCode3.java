package com.company;

//Longest Common Prefix

public class LeetCode3 {

    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        // Start with the first string as the initial prefix
        String prefix = strs[0];

        // Compare the prefix with each string in the array
        for (int i = 1; i < strs.length; i++) {
            // Shorten the prefix until it matches the start of strs[i]
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }

        return prefix;
    }

    public static void main(String[] args) {
        // Примеры входных данных
        String[] strs1 = {"flower", "flow", "flight"};
        String[] strs2 = {"dog", "racecar", "car"};
        String[] strs3 = {"interview", "internet", "interval"};

        // Вызов метода и вывод результатов
//        System.out.println("Example 1: " + longestCommonPrefix(strs1)); // Ожидается "fl"
//        System.out.println("Example 2: " + longestCommonPrefix(strs2)); // Ожидается ""
        System.out.println("Example 3: " + longestCommonPrefix(strs3)); // Ожидается "int"
    }
}
