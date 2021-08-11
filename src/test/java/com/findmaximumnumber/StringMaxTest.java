package com.findmaximumnumber;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class StringMaxTest 
{
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    @Test
	public void findMaxTC1() {
    	String stringValue1 = "Mango" , stringValue2 = "PineApple" , stringValue3 = "Orange";    	
    	FindMaximum find = new FindMaximum(stringValue1, stringValue2, stringValue3);
    	String maxStringValue = (String) find.findMax(); 
		Assertions.assertEquals("PineApple", maxStringValue);
	}
	@Test
	public void findMaxTC2() {
		
		String stringValue1 = "Guava" , stringValue2 = "PineApple" , stringValue3 = "Orange";    	
    	FindMaximum find = new FindMaximum(stringValue1, stringValue2, stringValue3);
    	String maxStringValue = (String) find.findMax(); 
		Assertions.assertEquals("PineApple", maxStringValue);
		
	}
	@Test
	public void findMaxTC3() {
		String stringValue1 = "Guava" , stringValue2 = "Apple" , stringValue3 = "Pineapple";    	
    	FindMaximum find = new FindMaximum(stringValue1, stringValue2, stringValue3);
    	String maxStringValue = (String) find.findMax(); 
		Assertions.assertEquals("Pineapple", maxStringValue);
	}
	
}
