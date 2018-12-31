/***********************************************************************************************
 * Purpose : Simulates a gambler who start with $stake and place fair $1 bets until
 *			 he/she goes broke (i.e. has no money) or reach $goal. Keeps track of the number of
 *			 times he/she wins and the number of bets he/she makes. Run the experiment N
 *			 times, averages the results, and prints them out.
 *
 *@author Ansar
 *@version 1.2
 *@since 17/12/2018
 ***********************************************************************************************/
package com.fellowship.funtional;

import com.fellowship.utilities.Utility;

public class GamblerRunner 
{	/*
	 *The main function written to run the Gambler
	 */
	public static void main(String[] args) 
	{		
		// Getting initial amount of Gamblers
		System.out.println("Enter the $Stak Value  ");
		int $stak = Utility.getInt();
		
		//Getting desired amount of gambler
		System.out.println("Set your Goal..!");
		int $goal = Utility.getInt();
		
		//Getting Number of Trials Gambler Want
		System.out.println("Enter the number of times u want to try..!");
		int numOfTimes = Utility.getInt();
		
		// Calling method to perform task
		Utility.playGame($stak,$goal,numOfTimes);
	}
}
