package com.example.time.list;

import java.util.ArrayList;

import static com.example.time.list.ListNode.removeNode;

/*
 *@description:
 *@author jiafeng
 *@date 2020/1/7 0007 09:00
 */
public class Demo {

    public static void main(String[] args) {
        int[] arr = {1,7,7,1};
        int[] arr1 = {1,3,7,8,9};
        ListNode head = new ListNode(arr[0]);
        ListNode tail = head;
        for (int i = 1 ; i < arr.length ; i++){
            tail.next = new ListNode(arr[i]);
            tail = tail.next;
        }
        ListNode head1 = new ListNode(arr1[0]);
        ListNode tail1 = head1;
        for (int i = 1 ; i < arr1.length ; i++){
            tail1.next = new ListNode(arr1[i]);
            tail1 = tail1.next;
        }
        head1.reserve(head1);
        System.out.println(tail);
    }


}
