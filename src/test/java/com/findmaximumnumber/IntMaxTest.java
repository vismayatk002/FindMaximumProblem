package com.findmaximumnumber;

import org.junit.jupiter.api.Assertions;
import org.junit.Test;

public class IntMaxTest {

	@Test
    public void findMaxTC1()
    {
		Integer intValue1 = 800 , intValue2 = 557 , intValue3 = 500;    	
    	FindMaximum find = new FindMaximum(intValue1, intValue2, intValue3);
    	Integer maxIntValue = (Integer) find.testMaximum(); 
		Assertions.assertEquals(800, maxIntValue);
    }
	@Test
    public void findMaxTC2()
    {
		Integer intValue1 = 800 , intValue2 = 850 , intValue3 = 500;    	
    	FindMaximum find = new FindMaximum(intValue1, intValue2, intValue3);
    	Integer maxIntValue = (Integer) find.testMaximum(); 
		Assertions.assertEquals(850, maxIntValue);
    }
	@Test
    public void findMaxTC3()
    {
		Integer intValue1 = 800 , intValue2 = 557 , intValue3 = 930;    	
    	FindMaximum find = new FindMaximum(intValue1, intValue2, intValue3);
    	Integer maxIntValue = (Integer) find.testMaximum(); 
		Assertions.assertEquals(930, maxIntValue);
    }
}
