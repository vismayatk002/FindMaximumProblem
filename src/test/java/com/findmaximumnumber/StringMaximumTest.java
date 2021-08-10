package com.findmaximumnumber;

import org.junit.jupiter.api.Assertions;
import org.junit.Test;

public class StringMaximumTest {

	@Test
	public void findMaxTC1() {
		FindMaximum find = new FindMaximum();
		String stringObj1 = String.valueOf("Pineapple");
        String stringObj2 = String.valueOf("Apple");
        String stringObj3 = String.valueOf("Orange");
        String maxStringValue = find.findMaxString(stringObj1, stringObj2, stringObj3);
        Assertions.assertEquals("Pineapple", maxStringValue);
	}
	@Test
	public void findMaxTC2() {
		FindMaximum find = new FindMaximum();
		String stringObj1 = String.valueOf("Guava");
        String stringObj2 = String.valueOf("Apple");
        String stringObj3 = String.valueOf("Orange");
        String maxStringValue = find.findMaxString(stringObj1, stringObj2, stringObj3);
        Assertions.assertEquals("Orange", maxStringValue);
	}
	@Test
	public void findMaxTC3() {
		FindMaximum find = new FindMaximum();
		String stringObj1 = String.valueOf("Guava");
        String stringObj2 = String.valueOf("Apple");
        String stringObj3 = String.valueOf("Pineapple");
        String maxStringValue = find.findMaxString(stringObj1, stringObj2, stringObj3);
        Assertions.assertEquals("Pineapple", maxStringValue);
	}
}
