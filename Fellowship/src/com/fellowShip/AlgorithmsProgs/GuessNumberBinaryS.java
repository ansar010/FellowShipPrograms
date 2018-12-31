/*********************************************************************************
 * purpose : Program to find the guessed number by suing binary search technique
 * 
 * @author Ansar
 * @version 1.2
 * @since 27/12/2018
 *********************************************************************************/
package com.fellowShip.AlgorithmsProgs;

import com.fellowship.utilities.Utility;

public class GuessNumberBinaryS
{
	public static void main(String args[])
	{	// to get passed command line argument
		int num = Integer.parseInt(args[0]);
		//Calling method to find the power 
		int n=(int)Math.pow(2, num);
		System.out.println("Guess Number from 0 to "+(n-1));
		int low = 0;//Starting Index
		int high = n-1;//End Index
		int count=0;//Number of iteration
		//Loop until guessed number find
		while(!(num<0))
		{
			count++;
			int mid = (low+high)/2;
			System.out.println("Is the gussed number is : "+mid);
			System.out.println("y->yes  n->No");
			char response = Utility.getChar();
			if(response=='y')
			{	
				System.out.println("You number is : "+mid);
				System.out.println("The Intermediary numbers are : "+(mid-1)+" and "+(mid+1));
				System.out.println("Number of try to find Guessed number is : "+count);
				break;
			}
			else
			{
				System.out.println("Is guessed Number Greater than "+mid);
				System.out.println("Y->yes  N->No");
				response = Utility.getChar();
				if(response=='y')
				{
					low=mid+1;
				}
				else
				{
					high=mid-1;
				}

			}
		}
	}
}
