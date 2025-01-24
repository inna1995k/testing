package com.company;

//Convert Sorted Array to Binary Search Tree
public class LeetCode5 {
    public TreeNode sortedArrayToBST(int[] nums) {
        return helper(nums, 0, nums.length - 1);
    }

    private TreeNode helper(int[] nums, int left, int right) {
        if (left > right) {
            return null; // Базовый случай: пустой подмассив
        }

        // Выбираем средний элемент как корень
        int mid = left + (right - left) / 2;
        TreeNode root = new TreeNode(nums[mid]); //новый массив с верхней точкой значения как середина массива

        // Рекурсивно строим левое и правое поддеревья
        root.left = helper(nums, left, mid - 1); //левое поддерево
        root.right = helper(nums, mid + 1, right); //правое поддерево

        return root;
    }

    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
    }
}
