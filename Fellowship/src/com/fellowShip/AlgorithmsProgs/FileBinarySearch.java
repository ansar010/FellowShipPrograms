/*****************************************************************************
 * purpose : Program to find the word from file 
 * 
 * @author Ansar
 * @version 1.2
 * @since 27/12/2018
 ******************************************************************************/
package com.fellowShip.AlgorithmsProgs;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import com.fellowship.utilities.Utility;

public class FileBinarySearch 
{	
	public static void main(String[] args) 
	{	//Calling method to take string file array
		String []strFile = readFileStrArr();

		System.out.println("Unsorted string File");
		System.out.println("====================");
		Utility.displayStrArr(strFile);//calling method to display array

		Utility.stringBubbleSort(strFile);//Calling method to sort the string file

		System.out.println("\n\nSorted File");
		System.out.println("===========");
		Utility.displayStrArr(strFile);

		System.out.print("\nEnter the Element You want to search : ");
		String search=Utility.getLine();
		//Calling method to find string element
		int index=Utility.stringBinarySearch(strFile, 0, strFile.length-1, search);
		if(index==-1)
		{
			System.out.println("Word Not Found..!");
		}
		else
		{
			System.out.println("Element found in index of "+index);
		}


	}
	/**
	 * Method to to read file and get it in the form of string array
	 * @return string array
	 */
	private static String[] readFileStrArr()
	{
		try {
			BufferedReader br = new BufferedReader(new FileReader("/home/admin1/Desktop/ProgFiles/FileBinarySearch.txt"));
			String string="";
			try {
				while((string=br.readLine())!=null)
				{	//calling method to split a string into an array of substring
					return string.split(" ");//split by space
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		return null;
	}
}
