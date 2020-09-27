package com.example.time.leetcode;


/*
 *@description:您将获得一个双向链表，除了下一个和前一个指针之外，它还有一个子指针，可能指向单独的双向链表。这些子列表可能有一个或多个自己的子项，依此类推，生成多级数据结构，如下面的示例所示。
扁平化列表，使所有结点出现在单级双链表中。您将获得列表第一级的头部。
 *@author jiafeng
 *@date 2019/12/12 0012 13:51
 */
public class Flatten {
    public Node flatten(Node head) {
        if(head==null){
            return head;
        }
        Node cur=head;
        while(cur!=null){
            Node next=cur.next;
            if(cur.child!=null){
                Node child=cur.child;
                cur.next=child;
                child.prev=cur;
                cur.child=null;
                while(child!=null && child.next!=null){
                    child=child.next;
                }
                child.next=next;
                if(next!=null){
                    next.prev=child;
                }
            }
            cur=cur.next;
        }
        return head;
    }
}
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;

    public Node() {}

    public Node(int _val,Node _prev,Node _next,Node _child) {
        val = _val;
        prev = _prev;
        next = _next;
        child = _child;
    }
};