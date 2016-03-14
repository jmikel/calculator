package com.company;

import static org.junit.Assert.*;

/**
 * Created by John on 3/14/2016.
 */
public class CalculatorTest {
    int[][] data = {{1,2,3},
                    {2,2,4},
                    {5,6,11},
                    {2,2,4}};
    @org.junit.Test
    public void testSum() throws Exception {
        Calculator c = new Calculator();
        for(int lcv = 0; lcv < data.length; lcv++) {
            int num1 = data[lcv][0];
            int num2 = data[lcv][1];
            int expected = data[lcv][2];
            int result = c.sum(num1,num2);
            assertEquals(expected, result);

        }
    }
}