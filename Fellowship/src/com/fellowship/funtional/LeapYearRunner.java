/**********************************************************
 * purpose : To check the given year is leap year or not 
 * 
 * @author Ansar
 * @version 1.2
 * @since 15/12/2018
 **********************************************************/
package com.fellowship.funtional;

import com.fellowship.utilities.Utility;

public class LeapYearRunner 
{	/*
	 *The main function written to run the isLeapYear
	 */
	public static void main(String[] args)
	{
		System.out.println("Enter the Year to Check whether it is Leap Year or Not..!");
		int year = Utility.getInt();
		Utility.isLeapYear(year); //calling method to check leap year
	}
}
