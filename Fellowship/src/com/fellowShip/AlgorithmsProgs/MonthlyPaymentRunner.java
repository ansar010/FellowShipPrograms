/*********************************************************************************
 * purpose : Program to get monthly payment
 * 
 * @author Ansar
 * @version 1.2
 * @since 28/12/2018
 *********************************************************************************/
package com.fellowShip.AlgorithmsProgs;

import com.fellowship.utilities.Utility;

public class MonthlyPaymentRunner 
{
	public static void main(String[] args) 
	{
		double p;
		int  y;
		double rate;
		System.out.println("Enter the p value");
		p=Utility.getDouble();
		System.out.println("Enter the y value");
		y=Utility.getInt();
		System.out.println("Enter the r value ");
		rate=Utility.getDouble();	
		
		double payment=Utility.monthlyPayment(p, y, rate);
		System.out.println("The Monthly Payment is : "+payment);
		}
}
