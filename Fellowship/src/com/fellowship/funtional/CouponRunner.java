/****************************************************************************************
 * purpose : Given N distinct Coupon Numbers, how many random numbers do you
 * 			 need to generate distinct coupon number? This program simulates this random
 *			 process.
 *
 *@author Ansar
 *@version 1.2
 *@since 18/12/2018
 ****************************************************************************************/
package com.fellowship.funtional;

import com.fellowship.utilities.Utility;

public class CouponRunner
{	/*
	 *The main function written to run the coupon
	 */
	public static void main(String[] args)
	{
		System.out.println("Enter Number of Coupons you want..!");
		int[] coupons = Utility.createIntArr(); // Calling method to create and insert integer in array
		
		// calling method to get distinct random number
		// variable turns hold total number of iteration
		int iteration=Utility.totalIterations(coupons);
		System.out.println("Total randrom number / Turns to needed for distinct coupons : "+iteration);
	}
}
