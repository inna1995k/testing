package com.company;

//Single Number
public class LeetCode6 {
    public static int singleNumber(int[] nums) {
        for (int i = 0; i < nums.length ; i++) {
            if(nums[i] == nums[i-1]){
                return nums[i];
            }
        }
        return nums.length;
    }

    public static void main(String[] args) {
        int [] nums = {2,2,1};
        System.out.println(singleNumber(nums));
    }
}
