/******************************************************************************
 * Purpose : To Flip Coin and Calculate Percentage
 * 
 * @author Ansar
 * @version 1.2
 * @since 15/12/2018
 ******************************************************************************/
package com.fellowship.funtional;

import com.fellowship.utilities.Utility;

public class FlipCoinRunner 
{	/*
	 *The main function written to run the flipCoin
	 */
	public static void main(String[] args)
	{

		System.out.println("Enter the number of times You want to flip Coin..");
		int n = Utility.getInt();  // n-> Number of time user want to flip coin
		Utility.flipCoin(n); // calling method to flip coin and calculate percentage
		
	}
}
