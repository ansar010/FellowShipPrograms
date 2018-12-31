/************************************************
 * purpose : To Print Nth Harmonic Number
 * 
 * @author Ansar
 * @version 1.2
 * @since 17/12/2018
 ************************************************/
package com.fellowship.funtional;

import com.fellowship.utilities.Utility;

public class HarmonicRunner 
{	/*
	 *The main function written to run the HarmonicNumber
	 */
	public static void main(String[] args) 
	{
		System.out.println("Enter the N number: ");
		int n=Utility.getInt(); // n -> To get number from user
		Utility.nHarmonicValue(n);
	}
}
