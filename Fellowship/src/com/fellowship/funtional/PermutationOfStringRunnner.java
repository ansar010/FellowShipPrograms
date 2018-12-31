/**********************************************************
 * purpose : To print all possible permutation of string 
 * 
 * @author Ansar
 * @version 1.2
 * @since 19/12/2018
 **********************************************************/

package com.fellowship.funtional;

import com.fellowship.utilities.Utility;

public class PermutationOfStringRunnner 
{	/*
	 *The main function written to run the permutationString
	 */
	public static void main(String[] args)
	{
		System.out.println("Enter the String..");
		String word = Utility.getWord();
		
		// Method call for all possible combination 
		Utility.permutationString(word,0,word.length()-1);
	}
}
