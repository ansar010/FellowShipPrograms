/************************************************
 * purpose : Generate power series of 2 upto n
 * 
 * @author Ansar
 * @version 1.2
 * @since 17/12/2018
 ************************************************/
package com.fellowship.funtional;
import com.fellowship.utilities.Utility;

public class PowerSeriesRunner 
{	/*
	 *The main function written to run the powerSeries
	 */
	public static void main(String[] args)
	{	
		System.out.println("Enter the Number : ");
		int num = Utility.getInt(); //num -> To get Number from user
		Utility.powerSeries(num); //Calling Method to generate power series of n
	}
}
