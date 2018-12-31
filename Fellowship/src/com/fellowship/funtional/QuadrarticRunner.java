/********************************************************************
 * purpose : A Quadratic program to find the roots of a equation 
 * 
 * @author Ansar
 * @version 1.2
 * @since 21/12/2018
 ********************************************************************/
package com.fellowship.funtional;

import com.fellowship.utilities.Utility;

public class QuadrarticRunner
{	/*
	 *The main function written to run the Quadratic method
	 */
	public static void main(String[] args) 
	{
		System.out.println("Enter the value of a : ");
		int a = Utility.getInt();

		System.out.println("Enter the value of b : ");
		int b = Utility.getInt();
		
		System.out.println("Enter the value of c : ");
		int c = Utility.getInt();
		// Calling method to find the root1 and root2 of x
		Utility.quadratic( a, b, c);
	}
}
