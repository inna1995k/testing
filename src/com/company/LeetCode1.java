package com.company;

import java.util.HashMap;
import java.util.Map;

public class LeetCode1 {

    public static void main(String[] args) {
        int[] nums = {3, 2, 4};
        int target = 6;

        // Вызов метода twoSum
        int[] result = twoSum(nums, target);

        // Вывод результата
        System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i < nums.length; i++){
            int complex = target - nums[i];

            if(map.containsKey(complex)){
                return new int [] {
                        map.get(complex), i
                };
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
