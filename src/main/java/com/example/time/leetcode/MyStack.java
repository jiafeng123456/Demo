package com.example.time.leetcode;

import java.util.ArrayList;
import java.util.List;

/*
 *@description:
 *@author jiafeng
 *@date 2020/9/21 0021 14:49
 */
public class MyStack {
    List<Integer> list = new ArrayList<>();

    /** Initialize your data structure here. */
    public MyStack() {

    }

    /** Push element x onto stack. */
    public void push(int x) {
        list.add(x);
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        return list.remove(list.size()-1);
    }

    /** Get the top element. */
    public int top() {
        return list.get(list.size()-1);
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return list.size() == 0;
    }
}
