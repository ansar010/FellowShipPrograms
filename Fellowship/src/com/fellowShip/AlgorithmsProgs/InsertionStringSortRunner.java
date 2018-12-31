/**
 * purpose : Program to get string and sort in insertion sorting order
 * 
 * @author Ansar
 * @verion 1.2
 * @simce 24/12/2018
 */
package com.fellowShip.AlgorithmsProgs;

import com.fellowship.utilities.Utility;

public class InsertionStringSortRunner 
{	/*
 	 * The main function written to run string insertion sort
 	 */		
	public static void main(String[] args) 
	{
		System.out.println("Enter the Number of words : ");
		// variable size array size
		int size = Utility.getInt();
		//string array to store user input
		String words[] = new String[size];
		System.out.println("Enter "+size+" Elements");
		
		//Loop to get user string data store index-wise
		for(int i =0;i<words.length;i++)
		{
			words[i]=Utility.getWord();
		}
		//Calling method sort string in insertion sorting order
		Utility.stringInsertionSort(words);
		System.out.println("Sorted List : ");
		//loop to display sorted array
		for(int i = 0;i<words.length;i++)
		{
			System.out.println(i+1+" "+words[i]);
		}
	}
}
