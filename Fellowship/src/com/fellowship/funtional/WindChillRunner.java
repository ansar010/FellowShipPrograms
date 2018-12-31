/******************************************************************************
 * purpose : Program to get WindChill by taking two values temprature and speed
 * 
 * @author Ansar
 * @version 1.2
 * @since 21/12/2018
 ******************************************************************************/  
package com.fellowship.funtional;

import com.fellowship.utilities.Utility;

public class WindChillRunner
{	/*
	 *The main function written to validate user input and run the windChill
	 */
	public static void main(String[] args)
	{
		System.out.println("Give the Value of t(Temprature) and v(Speed)");
		System.out.println("as Command line Arguments");
		//double t = Utilities.getDouble();
		
		// variable t holds Temperature value
		double t = Double.parseDouble(args[0]);
		// Iterate until user gives valid data 
		while(t>50)
		{
			System.out.println("t value should be less than 50..!");
			System.out.println("Enter valid t value");
		//	t=Utilities.getDouble();
			t = Double.parseDouble(args[1]);
		}
		//double v = Utilities.getDouble();
		double v = Double.parseDouble(args[1]);
		while(v>120||v<3)
		{
			System.out.println("v value shoud not be greater than 120 or less than 3 ");
			System.out.println("Enter valid v value");
		//	v=Utilities.getDouble();
		
			v = Double.parseDouble(args[2]);
		}
		
		// calling method to pass t and v value and get windChill
		double windchill=Utility.windChill(t,v);
		System.out.println("The WindChill is : "+windchill);
	}
}
