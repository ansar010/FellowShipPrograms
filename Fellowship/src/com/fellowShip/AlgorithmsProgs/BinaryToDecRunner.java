/*********************************************************************************
 * purpose : Program to convert decimal number to binary
 * 
 * @author Ansar
 * @version 1.2
 * @since 28/12/2018
 *********************************************************************************/
package com.fellowShip.AlgorithmsProgs;

import com.fellowship.utilities.Utility;

public class BinaryToDecRunner 
{	/*
	 *written main to run toBinary and padding method
	 */
	public static void main(String[] args)
	{
		System.out.print("Enter the decimal Number : ");
		int decNum=Utility.getInt();
		//calling method to convert decimal into binary
		String binary=Utility.toBinary(decNum);
		//calling method for padding
		Utility.padding(binary);
		
	}
}
