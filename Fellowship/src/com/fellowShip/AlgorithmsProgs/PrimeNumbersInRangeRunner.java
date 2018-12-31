/******************************************************************************
 * purpose : Program print prime number in range between 1 to 1000
 * 
 * @author Ansar
 * @version 1.2
 * @since 24/12/2018
 ******************************************************************************/  
package com.fellowShip.AlgorithmsProgs;

import com.fellowship.utilities.Utility;

public class PrimeNumbersInRangeRunner
{	/*
	 *The main function written to run the isPrime
	 */

	public static void main(String[] args) 
	{	//total number of primes
		int count=0;
	System.out.println("Prime Numbers between 1 to 1000: ");
	for(int i =1;i<=1000;i++)
	{	//Calling method to check prime
		if(Utility.isPrime(i))
		{
			count++;
			System.out.println(i);
		}
	}
	System.out.print("Total Number of prime : "+count+"\n");
	}
}
