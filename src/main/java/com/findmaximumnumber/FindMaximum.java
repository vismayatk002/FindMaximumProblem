package com.findmaximumnumber;

public class FindMaximum<T extends Comparable<T>>
{
	T input1, input2, input3;
	
	FindMaximum(T input1, T input2, T input3){
		this.input1 = input1; 
		this.input2 = input2; 
		this.input3 = input3; 
	}
	public T findMax() {
		return FindMaximum.findMax(input1, input2, input3);
	}
	public static <T extends Comparable<T>> T findMax(T input1, T input2, T input3) {
    	
		//assume input1 is max
		T maxValue = input1;
    	if(input2.compareTo(maxValue) > 0) {
    		maxValue = input2;
    	}
    	else if(input3.compareTo(maxValue) > 0) {
    		maxValue = input3;
    	}
    	else{
    		maxValue = input1;
    	}
    	showMaxValue(input1, input2, input3, maxValue);
    	return maxValue;
    }
	public static <T> void showMaxValue(T input1, T input2, T input3, T maxValue) {
		
		System.out.println("\nNumber1 : "+ input1 + "\nNumber2 : " + input2 + "\nNumber3 : " + input3);
        System.out.println("Maximum : " + maxValue);
	}
    public static void main( String[] args )
    {
    	
        Integer intValue1 = 800 , intValue2 = 300 , intValue3 = 200;
        Float floatValue1 = 6.3f , floatValue2 = 3.0f , floatValue3 = 4.7f;
        String stringValue1 = "Mango" , stringValue2 = "PineApple" , stringValue3 = "Orange";
        
        new FindMaximum(intValue1, intValue2, intValue3).findMax();
        new FindMaximum(floatValue1, floatValue2, floatValue3).findMax();
        new FindMaximum(stringValue1, stringValue2, stringValue3).findMax();
    }
}
        
        
//        