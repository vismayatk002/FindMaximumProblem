package com.findmaximumnumber;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class StringMaxTest 
{
    
    @Test
	public void findMaxTC1() {
    	String stringValue1 = "PineApple" , stringValue2 = "Mango" , stringValue3 = "Orange";    	
    	String maxValue = FindMaximum.getMax(stringValue1, stringValue2, stringValue3); 
		Assertions.assertEquals("PineApple", maxValue);
	}
	@Test
	public void findMaxTC2() {
		
		String stringValue1 = "Grape" , stringValue2 = "Orange" , stringValue3 = "Mango";    	
		String maxValue = FindMaximum.getMax(stringValue1, stringValue2, stringValue3); 
		Assertions.assertEquals("Orange", maxValue);
		
	}
	@Test
	public void findMaxTC3() {
		String stringValue1 = "Mango" , stringValue2 = "Orange" , stringValue3 = "PineApple";    	
		String maxValue = FindMaximum.getMax(stringValue1, stringValue2, stringValue3); 
		Assertions.assertEquals("PineApple", maxValue);
	}
	
}
