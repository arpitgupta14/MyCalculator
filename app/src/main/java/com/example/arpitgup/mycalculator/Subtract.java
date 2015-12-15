package com.example.arpitgup.mycalculator;

/**
 * Created by arpitgup on 12/11/15.
 */
public class Subtract implements Operator {
    @Override
    public int operate(int val1, int val2) {
        return val1 - val2;
    }
}
