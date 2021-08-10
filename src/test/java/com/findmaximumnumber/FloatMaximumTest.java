package com.findmaximumnumber;

import org.junit.jupiter.api.Assertions;
import org.junit.Test;

public class FloatMaximumTest {

	@Test
	public void findMaxTC1() {
		FindMaximum find = new FindMaximum();
		Float floatObj1 = Float.valueOf("10.0");
        Float floatObj2 = Float.valueOf("7.1");
        Float floatObj3 = Float.valueOf("6.4");
        float maxFloatValue = find.findMaxFloat(floatObj1, floatObj2, floatObj3);
        Assertions.assertEquals(10.0, maxFloatValue);
	}
	@Test
	public void findMaxTC2() {
		FindMaximum find = new FindMaximum();
		Float floatObj1 = Float.valueOf("8.3");
        Float floatObj2 = Float.valueOf("15.0");
        Float floatObj3 = Float.valueOf("6.4");
        float maxFloatValue = find.findMaxFloat(floatObj1, floatObj2, floatObj3);
        Assertions.assertEquals(15.0, maxFloatValue);
	}
	@Test
	public void findMaxTC3() {
		FindMaximum find = new FindMaximum();
		Float floatObj1 = Float.valueOf("8.3");
        Float floatObj2 = Float.valueOf("15.0");
        Float floatObj3 = Float.valueOf("20.0");
        float maxFloatValue = find.findMaxFloat(floatObj1, floatObj2, floatObj3);
        Assertions.assertEquals(20.0, maxFloatValue);
	}
}
