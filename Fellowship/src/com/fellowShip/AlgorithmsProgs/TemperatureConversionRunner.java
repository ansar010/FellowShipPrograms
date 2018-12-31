/*********************************************************************************
 * purpose : Program to get temperature 
 * 
 * @author Ansar
 * @version 1.2
 * @since 28/12/2018
 *********************************************************************************/
package com.fellowShip.AlgorithmsProgs;

import com.fellowship.utilities.Utility;

public class TemperatureConversionRunner 
{
	public static void main(String[] args)
	{
		System.out.println("Chose method  c-CelToFar  f-FarToCel");
		char key = Utility.getChar();
		
		switch (key)
		{
		case 'c':
			System.out.println("Enter the temperature value in celcius : ");
			int c = Utility.getInt();
			double fResult=Utility.temperatureConversion(c, 'c');
			System.out.println("Temperature is : "+fResult+"°F");
			break;
		
		case 'f':
			System.out.println("Enter the temperature value in farenheit : ");
			int f = Utility.getInt();
			double cResult=Utility.temperatureConversion(f, 'f');
			System.out.println("Temperature is : "+cResult+"°C");
			break;
		
		default:
			System.out.println("Invalid option");
			break;
		}
	}
}
