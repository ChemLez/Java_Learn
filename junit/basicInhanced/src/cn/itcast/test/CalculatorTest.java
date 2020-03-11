package cn.itcast.test;

import cn.itcast.junit.Calculator;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

    @Before
    public void init() {
        System.out.println("init...");
    }

    @After
    public void close() {
        System.out.println("close...");
    }

    @Test
    public void testAdd() {

        Calculator cal = new Calculator();
        int result = cal.add(1, 2);
        System.out.println("setup add");
        Assert.assertEquals(3, result);
    }

    @Test
    public void testSub() {

        Calculator calculator = new Calculator();
        int result = calculator.sub(1, 2);
        System.out.println("setup sub");
        Assert.assertEquals(-1, result);
    }
}
