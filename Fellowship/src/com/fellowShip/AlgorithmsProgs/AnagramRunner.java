/******************************************************************************
 * purpose : Program to check Given two String is Anagram or Not
 * 
 * @author Ansar
 * @version 1.2
 * @since 22/12/2018
 ******************************************************************************/  
package com.fellowShip.AlgorithmsProgs;

import com.fellowship.utilities.Utility;

public class AnagramRunner
{	/*
	 *The main function written to run the isAnagram
	 */
	public static void main(String[] args)
	{
		System.out.println("Program to Check Two Strings are Anagram or not..!");
		System.out.println("==================================================");
		
		System.out.print("Enter First String : ");
		String firstString = Utility.getLine();
		
		System.out.print("Enter Second String: ");
		String secondString = Utility.getLine();
		// Calling  method to check Anagram
		Utility.isAnagram(firstString,secondString);
	}
}
