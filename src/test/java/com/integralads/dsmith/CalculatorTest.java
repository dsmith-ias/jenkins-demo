package com.integralads.dsmith;

import junit.framework.Assert;
import org.junit.Test;

public class CalculatorTest {
    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        Assert.assertEquals(calculator.add(1, 2), 3);
    }

    @Test
    public void testMultiply() {
        Calculator calculator = new Calculator();
        Assert.assertEquals(calculator.multiply(2, 3), 6);
    }
}