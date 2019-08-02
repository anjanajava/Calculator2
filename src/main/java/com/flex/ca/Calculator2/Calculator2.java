package com.flex.ca.Calculator2;

public class Calculator2 {
	public static Integer sum(Integer x, Integer y)
	{
		if (x == null || y == null)
			return null;   
		return (x+y);
	}
	
	public static Integer sub(Integer x, Integer y)
	{
		if (x == null || y == null)
			return null;   
		return (x-y);
	}
}
