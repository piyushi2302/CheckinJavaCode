package com.example;

import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;

public class CalculatorTest {

    @Test
    public void testAddition() {

        App obj = new App();

        int result = obj.add(4, 1);

        assertEquals(result, 10);

        System.out.println("Addition Test Passed!");
    }
}
