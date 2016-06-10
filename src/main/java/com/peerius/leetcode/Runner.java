package com.peerius.leetcode;

/**
 * Created by bzhou on 03/06/16.
 */
public class Runner {
    public static void main( String[] args )
    {
        ReverseInteger ri = new ReverseInteger();
        int riint = ri.reverse(231);

        AddDigits rd = new AddDigits();
        int rdint = rd.adddigits(923753);

        System.out.println(riint);
        System.out.println(rdint);
    }
}
