package com.example.time.list;

import javax.xml.soap.Node;
import java.util.ArrayList;

/*
 *@description:
 *@author jiafeng
 *@date 2020/1/7 0007 08:56
 */
public class ListNode {
    //当前节点
    protected int val;
    //下一节点;
    protected ListNode next = null;
    //上一节点
    protected ListNode pre = null;

    ListNode(int val){
        this.val = val;
        this.next = null;
        this.pre = null;
    }

    public ListNode insert(int[] arr, int[] nxt, int val) {
        if (arr.length == 0) {
            return new ListNode(val);
        }

        ListNode head = new ListNode(arr[0]);
        ListNode tail = head;
        ListNode ins = new ListNode(val);

        // 构建链表
        for (int i = 0; i < arr.length - 1; i++) {
            tail.next = new ListNode(arr[nxt[i]]);
            tail = tail.next;
        }

        // 插入值
        // 若插入值小于头
        if (val < head.val) {
            ins.next = head;
            return ins;
        }

        ListNode pre = head;
        ListNode now = head.next;
        while (now != null && val > now.val) {
            pre = now;
            now = now.next;
        }
        pre.next = ins;
        ins.next = now;

        return head;
    }

    public static ListNode removeNode(ListNode pNode, int delVal) {
        if (pNode == null) return null;
        if (pNode.val == delVal) return pNode.next;

        ListNode pre = pNode;
        ListNode cur = pNode.next;
        while (cur != null) {
            if (cur.val == delVal) {
                pre.next = cur.next;
                break;
            }
            pre = cur;
            cur = cur.next;
        }
        return pNode;
    }

    // 题意要求解法 小于等于在前 大于在后
    public ListNode listDivide0(ListNode head, int val) {
        if (head == null || head.next == null) return head;

        // 为了保证 minHead 与 min 起始相同，先弄一个临时结点 0
        ListNode cur = head, min = new ListNode(0), minHead = min, max = new ListNode(0), maxHead = max;
        while(cur != null) {
            if (cur.val <= val) {
                min.next = cur;
                min = cur;
            } else {
                max.next = cur;
                max = cur;
            }
            cur = cur.next;
        }
        // 链接大小节点
        min.next = maxHead.next;
        head = minHead.next;

        return head;
    }

    public ArrayList findCommonParts(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;
        ArrayList<Integer> res = new ArrayList<>();

        while (headA != null && headB != null) {
            if (headA.val == headB.val) {
                res.add(headA.val);
                headA = headA.next;
                headB = headB.next;
            } else if (headA.val > headB.val){
                headB = headB.next;
            } else headA = headA.next;
        }

        return res;
    }

    public boolean isPalindrome(ListNode listNode){
        if (listNode==null) return false;
        ListNode frist = listNode;
        ListNode slow = listNode;
        int flag = 0 ;
        while (slow != null) {
            slow = slow.next;
            flag++;
        }
        int mid = flag % 2 == 0 ? 0 : 1;
        ListNode midPre = listNode;
        ListNode midNext = null;
        if (mid == 0){
            for (int i = 1 ; i < flag/2;i++){
                midPre = midPre.next;
                midNext = midPre.next;
            }
            for (int i = 1 ; i <flag/2;i++){
                if (midPre.val != midNext.val){
                    return false;
                }
                midPre = midPre.pre;
                midNext = midNext.next;
            }
        }
        System.out.println(midPre);
        return true;
    }

    public ListNode reserve(ListNode listNode){
        if (listNode == null || listNode.next == null) return listNode;
        ListNode head = listNode;
        ListNode pr = null;
        while (head != null){
            ListNode temp = head;
            head = head.next;
            temp.next = pr;
            pr = temp;
        }
        return pr;
    }
}

