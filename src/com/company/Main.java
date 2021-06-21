package com.company;

import java.util.Arrays;

public class Main {

    public static int search(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if(target == nums[i]){
                return nums[i];
            }
            return nums[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(Main.search(new int[] {1,2,3,4}, 2));
    }
}
