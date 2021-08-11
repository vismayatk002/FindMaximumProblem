package com.findmaximumnumber;

import org.junit.jupiter.api.Assertions;
import org.junit.Test;

public class IntMaxTest {

	 @Test
	public void findMaxTC1() {
		Integer intValue1 = 850 , intValue2 = 678 , intValue3 = 500;    	
		Integer maxValue = FindMaximum.getMax(intValue1, intValue2, intValue3); 
		Assertions.assertEquals(850, maxValue);
		}
	@Test
    public void findMaxTC2(){
		
		Integer intValue1 = 800 , intValue2 = 900 , intValue3 = 500;    	
		Integer maxValue = FindMaximum.getMax(intValue1, intValue2, intValue3); 
		Assertions.assertEquals(900, maxValue);
		}
	@Test
    public void findMaxTC3(){
		
		Integer intValue1 = 800 , intValue2 = 850 , intValue3 = 980;    	
		Integer maxValue = FindMaximum.getMax(intValue1, intValue2, intValue3); 
		Assertions.assertEquals(980, maxValue);
		}
}
