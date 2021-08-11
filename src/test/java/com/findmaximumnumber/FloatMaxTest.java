package com.findmaximumnumber;

import org.junit.jupiter.api.Assertions;
import org.junit.Test;

public class FloatMaxTest {

	@Test
    public void findMaxTC1()
    {
		Float floatValue1 = 16.5f , floatValue2 = 12.7f , floatValue3 = 7.9f;   	
		Float maxValue = FindMaximum.getMax(floatValue1, floatValue2, floatValue3); 
		Assertions.assertEquals(16.5f, maxValue);
    }
	@Test
    public void findMaxTC2()
    {
		Float floatValue1 = 1.5f , floatValue2 = 12.7f , floatValue3 = 7.9f;    	
		Float maxValue = FindMaximum.getMax(floatValue1, floatValue2, floatValue3); 
		Assertions.assertEquals(12.7f, maxValue);
    }
	@Test
    public void findMaxTC3()
    {
		Float floatValue1 = 1.5f , floatValue2 = 12.7f , floatValue3 = 17.9f;    	
		Float maxValue = FindMaximum.getMax(floatValue1, floatValue2, floatValue3); 
		Assertions.assertEquals(17.9f, maxValue);
    }
}
