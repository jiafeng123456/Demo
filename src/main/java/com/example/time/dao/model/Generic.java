package com.example.time.dao.model;

/*
 *@author jiafeng
 *@date 2019/8/15 0015 11:13
 */
public class Generic<T> {
    private T key;

    public Generic(T key) {
        this.key = key;
    }

    public T getKey() {
        return key;
    }
}
