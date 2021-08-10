package com.findmaximumnumber;

import org.junit.jupiter.api.Assertions;
import org.junit.Test;

public class IntegerMaximumTest {

	@Test
    public void findMaxTC1()
    {
		FindMaximum find = new FindMaximum();
        Integer intObj1 = Integer.valueOf("800");
        Integer intObj2 = Integer.valueOf("557");
        Integer intObj3 = Integer.valueOf("500");
        int maxIntValue = find.findMaxInt(intObj1, intObj2, intObj3);
        Assertions.assertEquals(800, maxIntValue);
    }
	@Test
    public void findMaxTC2()
    {
		FindMaximum find = new FindMaximum();
        Integer intObj1 = Integer.valueOf("800");
        Integer intObj2 = Integer.valueOf("850");
        Integer intObj3 = Integer.valueOf("500");
        int maxIntValue = find.findMaxInt(intObj1, intObj2, intObj3);
        Assertions.assertEquals(850, maxIntValue);
    }
	@Test
    public void findMaxTC3()
    {
		FindMaximum find = new FindMaximum();
        Integer intObj1 = Integer.valueOf("800");
        Integer intObj2 = Integer.valueOf("850");
        Integer intObj3 = Integer.valueOf("950");
        int maxIntValue = find.findMaxInt(intObj1, intObj2, intObj3);
        Assertions.assertEquals(950, maxIntValue);
    } 
}
