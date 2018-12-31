/******************************************************************************
 * purpose : Program to take date from user and print day on that date
 * 
 * @author Ansar
 * @version 1.2
 * @since 22/12/2018
 ******************************************************************************/
package com.fellowShip.AlgorithmsProgs;

import com.fellowship.utilities.Utility;

public class DayOfWeekRunner 
{	/*
 	 * The main function written to run the dayOfWeek
 	 */	
	public static void main(String[] args)
	{
		System.out.println("Enter date month and Year in Command line argument");
		int day = Integer.parseInt(args[0]);
		int month = Integer.parseInt(args[1]);
		int year = Integer.parseInt(args[2]);
		String days[]= {"Sunday","Monday","TuesDay","WednessDay","ThursDay","FriDay","SaturDay"};
		//calling method to get the day on the given date
		int dayname=Utility.dayOfWeek(day,month,year);
		System.out.println("The Day of given date "+day+"/"+month+"/"+year+" is : "+days[dayname]);
	}
}
