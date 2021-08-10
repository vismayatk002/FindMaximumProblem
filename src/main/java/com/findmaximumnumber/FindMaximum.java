package com.findmaximumnumber;

public class FindMaximum implements MaxOperation
{
    public static void main( String[] args )
    {
    	FindMaximum find = new FindMaximum();
        Integer intObj1 = Integer.valueOf("800");
        Integer intObj2 = Integer.valueOf("557");
        Integer intObj3 = Integer.valueOf("500");
        int maxValue = find.findMaxInt(intObj1, intObj2, intObj3);
        System.out.println("Integer Maximum : " + maxValue);
    }
    public int findMaxInt(Integer intObj1, Integer intObj2, Integer intObj3) {
    	
    	int maxValue;
    	int result1 =  intObj1.compareTo(intObj2);
    	int result2 =  intObj1.compareTo(intObj3);
    	int result3 =  intObj2.compareTo(intObj3);
    	if(result1 > 0 && result2 > 0) {
    		maxValue = intObj1;
    	}
    	else if(result3 > 0 && result1 < 0) {
    		maxValue = intObj2;
    	}
    	else{
    		maxValue = intObj3;
    	}
    	return maxValue;
    }
}

