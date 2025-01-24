package com.company;

//Merge Two Sorted Lists


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
public class LeetCode4 {

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // Create a dummy node to serve as the starting point of the merged list
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;

        // Traverse both lists and merge them in sorted order
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }

        // If one of the lists still has elements, append them
        if (list1 != null) {
            current.next = list1;
        } else {
            current.next = list2;
        }

        // Return the merged list starting from the next of dummy node
        return dummy.next;
    }

    public static void main(String[] args) {
        // Example 1
        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        ListNode result = mergeTwoLists(list1, list2);
        printList(result); // Output: [1, 1, 2, 3, 4, 4]

        // Example 2
        list1 = null;
        list2 = null;
        result = mergeTwoLists(list1, list2);
        printList(result); // Output: []

        // Example 3
        list1 = null;
        list2 = new ListNode(0);
        result = mergeTwoLists(list1, list2);
        printList(result); // Output: [0]
    }

    private static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

//    dummy: фиктивный узел (с произвольным значением -1), который помогает упрощать работу с головой нового списка.
//    current: указатель, который будет перемещаться по новому списку, добавляя узлы.

//    Цикл продолжается, пока оба списка не станут пустыми.
//    Сравниваются текущие значения узлов list1 и list2:
//    Если list1.val <= list2.val, текущий узел list1 добавляется в новый список, и указатель list1 перемещается на следующий узел.
//    Иначе добавляется узел из list2, и указатель list2 перемещается.
//    Указатель current обновляется, чтобы продолжить построение нового списка.
}
