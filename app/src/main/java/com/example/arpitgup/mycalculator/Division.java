package com.example.arpitgup.mycalculator;

/**
 * Created by arpitgup on 12/11/15.
 */
public class Division implements Operator {
    @Override
    public int operate(int val1, int val2) {
        int result = 0;
        if(val2 != 0){
            result = val1/val2;
        }
        return result;
    }
}
