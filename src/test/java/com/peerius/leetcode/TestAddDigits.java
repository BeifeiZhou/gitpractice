package com.peerius.leetcode;

import junit.framework.*;
import junit.extensions.TestDecorator;
import junit.framework.AssertionFailedError;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestListener;
import junit.framework.TestResult;
import junit.framework.TestSuite;
import junit.framework.Assert;


/**
 * Created by bzhou on 03/06/16.
 */

public class TestAddDigits extends TestCase{
    public void testAddDigits(){
        AddDigits ad = new AddDigits();
        int result = ad.adddigits(923852);
        Assert.assertEquals(result, 2);
    }
}
