package com.peerius.leetcode;

/**
 * Created by bzhou on 03/06/16.
 */
public class ReverseInteger {
    public int reverse(int x) {
        int num = Math.abs(x);
        int ret = 0;
        while (num != 0) {
            int d = num - num / 10 * 10;
            ret = ret * 10 + d;
            num /= 10;
        }
        if (x < 0)
            return -ret;
        else
            return ret;
    }
}
