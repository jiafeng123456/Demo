package com.example.time.dao.model;

/*
 *@author jiafeng
 *@date 2019/8/13 0013 09:20
 */
public class Complex {
    private int imag;
    private int real;

    public Complex(int imag, int real) {
        this.imag = imag;
        this.real = real;
    }



    @Override
    public String toString() {
        return "imag=" + this.imag + "real =" + this.real;
    }
}
